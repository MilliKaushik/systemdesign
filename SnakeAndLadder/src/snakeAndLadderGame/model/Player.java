package snakeAndLadderGame.model;

public class Player {

	int id;

	int phoneNumber;

	public Player(int id, int phoneNumber) {
		this.id = id;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
