package tictactoe;

public class Player {

	int id;

	String phoneNumber;

	Game game;

	PlayerSymbol playerSymbol;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public PlayerSymbol getPlayerSymbol() {
		return playerSymbol;
	}

	public void setPlayerSymbol(PlayerSymbol playerSymbol) {
		this.playerSymbol = playerSymbol;
	}

}
