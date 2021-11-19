package hotelManagementSystem;

public abstract class Person {

	private int id;

	private String name;

	private String phone;

	private Account account;

	private Role role;

	public void setRole(Role role) {
		this.role = role;
	}

}
