package tictactoe;

import java.util.Date;

public class Move {

	private int id;

	private int playerId1;

	private Date timeOfMove;

	private int gameId;

	private Position position;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlayerId1() {
		return playerId1;
	}

	public void setPlayerId1(int playerId1) {
		this.playerId1 = playerId1;
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
