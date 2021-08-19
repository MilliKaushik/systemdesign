package snakeLadder;

import java.util.Date;

public class Move {

	private int id;

	private String playerName;

	private DiceValue diceValue;

	private Date timeOfMove;

	private int startPos;

	private int endPos;

	public Move() {
		this.timeOfMove = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public DiceValue getDiceValue() {
		return diceValue;
	}

	public void setDiceValue(DiceValue diceValue) {
		this.diceValue = diceValue;
	}

	public Date getTimeOfMove() {
		return timeOfMove;
	}

	public void setTimeOfMove(Date timeOfMove) {
		this.timeOfMove = timeOfMove;
	}

	public int getStartPos() {
		return startPos;
	}

	public void setStartPos(int startPos) {
		this.startPos = startPos;
	}

	public int getEndPos() {
		return endPos;
	}

	public void setEndPos(int endPos) {
		this.endPos = endPos;
	}

}
