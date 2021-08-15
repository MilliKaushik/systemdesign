package splitvise.service;

import java.util.ArrayList;
import java.util.List;

import splitvise.model.Expense;
import splitvise.model.ExpenseRequest;
import splitvise.model.UserExactShare;
import splitvise.model.UserShare;

public class ExactExpenseCalculator extends ExpenseCalculator {

	@Override
	public Expense calculateExpense(ExpenseRequest expenseRequest) {
		Expense expense = getBasicExpense(expenseRequest);

		List<UserExactShare> userExactShares = new ArrayList<>();
		for (UserShare userShare : expenseRequest.getUserShares()) {
			UserExactShare userExactShare = new UserExactShare();
			userExactShare.setUserId(userShare.getUserId());
			userExactShare.setAmount(userShare.getShare());
			userExactShares.add(userExactShare);
		}

		expense.setUserExactShares(userExactShares);
		return expense;
	}

}
