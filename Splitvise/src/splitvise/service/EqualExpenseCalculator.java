package splitvise.service;

import java.util.ArrayList;
import java.util.List;

import splitvise.model.Expense;
import splitvise.model.ExpenseRequest;
import splitvise.model.UserExactShare;
import splitvise.model.UserShare;

public class EqualExpenseCalculator extends ExpenseCalculator {

	@Override
	public Expense calculateExpense(ExpenseRequest expenseRequest) {
		Expense expense = getBasicExpense(expenseRequest);
		double totalAmount = expenseRequest.getTotalAmount();
		int totalNoOfShares = expenseRequest.getUserShares().size();
		double eachShare = totalAmount / totalNoOfShares;

		List<UserExactShare> userExactShares = new ArrayList<>();
		for (UserShare userShare : expenseRequest.getUserShares()) {
			UserExactShare userExactShare = new UserExactShare();
			userExactShare.setUserId(userShare.getUserId());
			userExactShare.setAmount(eachShare);
			userExactShares.add(userExactShare);
		}

		expense.setUserExactShares(userExactShares);
		return expense;
	}

}
