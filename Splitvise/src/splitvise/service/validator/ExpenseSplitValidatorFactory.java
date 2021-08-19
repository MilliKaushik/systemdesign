package splitvise.service.validator;

import splitvise.enumeration.ExpenseType;

public class ExpenseSplitValidatorFactory {

	public ExpenseSplitValidator getExpenseSplitValidator(ExpenseType expenseType) {
		ExpenseSplitValidator validator = null;
		switch (expenseType) {
		case PERCENT:
			validator = new PercentExpenseTypeValidator();
			break;
		case EXACT:
			validator = new AmountExpenseTypeValidator();
			break;
		default:
			validator = new NoValidationValidator();
		}

		return validator;
	}

}
