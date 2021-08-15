package splitvise.service;

import splitvise.ExpenseType;
import splitvise.model.Expense;
import splitvise.model.ExpenseRequest;
import splitvise.service.validator.ExpenseSplitValidator;
import splitvise.service.validator.ExpenseSplitValidatorFactory;
import splitvise.service.validator.InvalidExpenseException;

public class ExpenseService {

	private ExpenseSplitValidatorFactory expenseSplitValidatorFactory;

	private ExpenseCalculatorFactory expenseCalculatorFactory;

	public Expense createExpense(ExpenseRequest expenseRequest) {
		ExpenseType expenseType = expenseRequest.getExpenseType();
		ExpenseSplitValidator validator = expenseSplitValidatorFactory.getExpenseSplitValidator(expenseType);

		try {
			validator.validate(expenseRequest);
		} catch (InvalidExpenseException e) {
			e.printStackTrace();
		}

		ExpenseCalculator expenseCalculator = expenseCalculatorFactory.createExpenseCalculator(expenseType);
		Expense expense = expenseCalculator.calculateExpense(expenseRequest);

		return expense;
	}

}
