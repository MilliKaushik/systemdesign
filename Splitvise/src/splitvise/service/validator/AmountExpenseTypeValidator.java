package splitvise.service.validator;

import java.util.List;

import splitvise.model.ExpenseRequest;
import splitvise.model.UserShare;

public class AmountExpenseTypeValidator extends ExpenseSplitValidator {
	private static final double EPSILON = 0.000001d;

	@Override
	public void validate(ExpenseRequest expenseRequest) throws InvalidExpenseException {
		List<UserShare> split = expenseRequest.getUserShares();
		double totalAmount = expenseRequest.getTotalAmount();
		double splitSum = 0.0;
		for (UserShare userShare : split)
			splitSum += userShare.getShare();

		if (Math.abs(splitSum - totalAmount) > EPSILON)
			throw new InvalidExpenseException("The expense you entered is invalid");
	}

}
