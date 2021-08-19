package splitvise.service;

import java.util.ArrayList;
import java.util.List;

import splitvise.enumeration.ExpenseType;
import splitvise.model.Balance;
import splitvise.model.Expense;
import splitvise.model.ExpenseRequest;
import splitvise.model.UserExactShare;
import splitvise.model.UserShare;

public class OrchestratorService {

	private BalanceService balanceService;

	private ExpenseService expenseService;

	public OrchestratorService(BalanceService balanceService, ExpenseService expenseService) {
		this.balanceService = balanceService;
		this.expenseService = expenseService;
	}

	public void showAllBalances() {
		List<Balance> balances = balanceService.getBalances();

		printBalance(balances);
	}

	public void showBalanceByUserId(String userId) {
		List<Balance> balances = balanceService.getBalance(userId);

		printBalance(balances);
	}

	private void printBalance(List<Balance> balances) {
		if (balances.isEmpty()) {
			System.out.println("No balances");
			return;
		}

		for (Balance bal : balances) {
			System.out.println(bal.getOwedBy() + " owes " + bal.getOwedTo() + ": " + bal.getAmount());
		}
	}

	public void createExpense(String[] split) {
		String expenseBy = split[1];
		double totalAmount = Double.parseDouble(split[2]);
		int noOfUsers = Integer.parseInt(split[3]);
		String expenseTypeStr = split[4 + noOfUsers];
		ExpenseType expenseType = null;
		switch (expenseTypeStr) {
		case "EQUAL":
			expenseType = ExpenseType.EQUAL;
			break;
		case "EXACT":
			expenseType = ExpenseType.EXACT;
			break;
		case "PERCENT":
			expenseType = ExpenseType.PERCENT;
			break;
		}

		ExpenseRequest expenseRequest = new ExpenseRequest();
		expenseRequest.setExpenseBy(expenseBy);
		expenseRequest.setExpenseType(expenseType);
		expenseRequest.setTotalAmount(totalAmount);

		List<UserShare> userShares = new ArrayList<>();

		switch (expenseType) {
		case EQUAL:
			for (int i = 0; i < noOfUsers - 1; i++) {
				UserShare userShare = new UserShare();
				userShare.setShare(0.0);
				userShare.setUserId(split[4 + i + 1]);
				userShares.add(userShare);
			}
			break;
		default:
			for (int i = 0; i < noOfUsers - 1; i++) {
				UserShare userShare = new UserShare();
				userShare.setUserId(split[4 + i + 1]);
				userShare.setShare(Double.parseDouble(split[4 + noOfUsers + i + 1]));
				userShares.add(userShare);
			}
			break;
		}

		expenseRequest.setUserShares(userShares);

		Expense expense = expenseService.createExpense(expenseRequest);

		for (UserExactShare userExactShare : expense.getUserExactShares()) {
			Balance bal = new Balance(userExactShare.getUserId(), expense.getExpenseBy(), userExactShare.getAmount());
			balanceService.createOrUpdateBalance(bal);
		}
	}

}
