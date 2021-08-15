package splitvise.model;

import java.util.Date;
import java.util.List;

import splitvise.ExpenseType;

public class Expense {

	private int id;

	private int createdBy;

	private int expenseBy;

	private Date expenseDate;

	private Date createdOn;

	private double totalAmount;

	private ExpenseType expenseType;

	private List<UserExactShare> userExactShares;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Date getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<UserExactShare> getUserExactShares() {
		return userExactShares;
	}

	public void setUserExactShares(List<UserExactShare> userExactShares) {
		this.userExactShares = userExactShares;
	}

	public ExpenseType getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(ExpenseType expenseType) {
		this.expenseType = expenseType;
	}

}
