package splitvise.service.validator;

import splitvise.model.ExpenseRequest;

public abstract class ExpenseSplitValidator {

	public abstract void validate(ExpenseRequest expenseRequest) throws InvalidExpenseException;

}
