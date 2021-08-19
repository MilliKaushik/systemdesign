package snakeLadder;

public class PlayerPosition {

	private String playerName;

	private int position;

	public PlayerPosition(String playerName, int position) {
		this.playerName = playerName;
		this.position = position;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
