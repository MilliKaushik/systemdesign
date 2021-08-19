package splitvise.model;

import java.util.Date;
import java.util.List;

import splitvise.enumeration.ExpenseType;

public class ExpenseRequest {

	private String createdBy;

	private String expenseBy;

	private double totalAmount;

	private ExpenseType expenseType;

	private List<UserShare> userShares;

	private Date expenseDate;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getExpenseBy() {
		return expenseBy;
	}

	public void setExpenseBy(String expenseBy) {
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
