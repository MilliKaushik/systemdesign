package libraryManagementSystem;

import java.util.Date;

public class BorrowedBook {

	private int userId;

	private String bookCopyId;

	private Date dateOfIssue;

	private Date dateOfReturn;

	private boolean isReturned;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getBookCopyId() {
		return bookCopyId;
	}

	public void setBookCopyId(String bookCopyId) {
		this.bookCopyId = bookCopyId;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public Date getDateOfReturn() {
		return dateOfReturn;
	}

	public void setDateOfReturn(Date dateOfReturn) {
		this.dateOfReturn = dateOfReturn;
	}

	public boolean isReturned() {
		return isReturned;
	}

	public void setReturned(boolean isReturned) {
		this.isReturned = isReturned;
	}

}
