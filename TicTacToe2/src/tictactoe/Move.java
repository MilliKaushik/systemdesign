package tictactoe;

import java.util.Date;

public class Move {

	private int id;

	private PlayerSymbol playerSymbol;

	private Date timeOfMove;

	private int gameId;

	private Position position;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PlayerSymbol getPlayerSymbol() {
		return playerSymbol;
	}

	public void setPlayerSymbol(PlayerSymbol playerSymbol) {
		this.playerSymbol = playerSymbol;
	}

	public Date getTimeOfMove() {
		return timeOfMove;
	}

	public void setTimeOfMove(Date timeOfMove) {
		this.timeOfMove = timeOfMove;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
