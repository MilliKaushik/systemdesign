package splitvise.service;

import java.util.ArrayList;
import java.util.List;

import splitvise.model.Expense;
import splitvise.model.ExpenseRequest;
import splitvise.model.UserExactShare;
import splitvise.model.UserShare;

public class PercentExpenseCalculator extends ExpenseCalculator {

	@Override
	public Expense calculateExpense(ExpenseRequest expenseRequest) {
		Expense expense = getBasicExpense(expenseRequest);
		double totalAmount = expenseRequest.getTotalAmount();

		List<UserExactShare> userExactShares = new ArrayList<>();
		for (UserShare userShare : expenseRequest.getUserShares()) {
			UserExactShare userExactShare = new UserExactShare();
			userExactShare.setUserId(userShare.getUserId());
			userExactShare.setAmount((userShare.getShare() / 100) * totalAmount);
			userExactShares.add(userExactShare);
		}

		expense.setUserExactShares(userExactShares);
		return expense;
	}

}
