package splitvise.service;

import splitvise.enumeration.ExpenseType;

public class ExpenseCalculatorFactory {

	public ExpenseCalculator createExpenseCalculator(ExpenseType expenseType) {
		ExpenseCalculator expenseCalculator = null;
		switch (expenseType) {
		case PERCENT:
			expenseCalculator = new PercentExpenseCalculator();
			break;
		case EXACT:
			expenseCalculator = new ExactExpenseCalculator();
			break;
		case EQUAL:
			expenseCalculator = new EqualExpenseCalculator();
			break;
		}
		return expenseCalculator;
	}

}
