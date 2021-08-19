package splitvise.dao;

import java.util.HashMap;
import java.util.Map;

import splitvise.model.Expense;

public class ExpenseDAO {
	Map<Integer, Expense> expenses;

	public ExpenseDAO() {
		expenses = new HashMap<>();
	}

	public void save(Expense expense) {
		expenses.put(expense.getId(), expense);
	}

	public Expense findById(int expenseId) {
		return expenses.get(expenseId);
	}

}
