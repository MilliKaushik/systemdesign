package splitvise.service;

import java.util.Date;

import splitvise.model.Expense;
import splitvise.model.ExpenseRequest;

public abstract class ExpenseCalculator {

	public abstract Expense calculateExpense(ExpenseRequest expenseRequest);
	
	protected Expense getBasicExpense(ExpenseRequest expenseRequest) {
		Expense expense = new Expense();
		expense.setCreatedBy(expenseRequest.getCreatedBy());
		expense.setCreatedOn(new Date());
		expense.setExpenseBy(expenseRequest.getExpenseBy());
		expense.setExpenseDate(expenseRequest.getExpenseDate());
		expense.setExpenseType(expenseRequest.getExpenseType());
		expense.setTotalAmount(expenseRequest.getTotalAmount());
		return expense;
	}
}
