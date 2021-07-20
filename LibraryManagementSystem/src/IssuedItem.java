import java.util.Date;

public class IssuedItem {

	private int id;

	private User user;

	private Item item;

	private Date dateOfIssue;

	private Date dateOfReturn;

	private int duesPaid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
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

	public int getDuesPaid() {
		return duesPaid;
	}

	public void setDuesPaid(int duesPaid) {
		this.duesPaid = duesPaid;
	}

}
