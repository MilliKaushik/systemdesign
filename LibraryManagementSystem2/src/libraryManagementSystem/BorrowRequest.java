package libraryManagementSystem;

import java.util.Date;

public abstract class BorrowRequest {

	protected String book;

	private Integer userId;

	private Date dueDate;

	public String getBook() {
		return book;
	}

	protected abstract void setBook(String book);

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

}
