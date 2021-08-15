package splitvise.service.validator;

import java.util.List;

import splitvise.model.ExpenseRequest;
import splitvise.model.UserShare;

public class PercentExpenseTypeValidator extends ExpenseSplitValidator {

	private static final double EPSILON = 0.000001d;

	@Override
	public void validate(ExpenseRequest expenseRequest) throws InvalidExpenseException {
		List<UserShare> split = expenseRequest.getUserShares();
		double sum = 0.0;
		for (UserShare userShare : split)
			sum += userShare.getShare();

		if (Math.abs(sum - 100.00) > EPSILON)
			throw new InvalidExpenseException("The expense you entered is invalid");
	}

}
