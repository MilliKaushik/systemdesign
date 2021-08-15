package splitvise.model;

import java.util.Date;
import java.util.List;

import splitvise.ExpenseType;

public class ExpenseRequest {

	private int createdBy;

	private int expenseBy;

	private double totalAmount;

	private ExpenseType expenseType;

	private List<UserShare> userShares;

	private Date expenseDate;

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getExpenseBy() {
		return expenseBy;
	}

	public void setExpenseBy(int expenseBy) {
		this.expenseBy = expenseBy;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<UserShare> getUserShares() {
		return userShares;
	}

	public void setUserShares(List<UserShare> userShares) {
		this.userShares = userShares;
	}

	public ExpenseType getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(ExpenseType expenseType) {
		this.expenseType = expenseType;
	}

	public Date getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}

}
