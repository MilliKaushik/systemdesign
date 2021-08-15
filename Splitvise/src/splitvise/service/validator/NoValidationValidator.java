package splitvise.service.validator;

import splitvise.model.ExpenseRequest;

public class NoValidationValidator extends ExpenseSplitValidator {

	@Override
	public void validate(ExpenseRequest expenseRequest) throws InvalidExpenseException {

	}

}
