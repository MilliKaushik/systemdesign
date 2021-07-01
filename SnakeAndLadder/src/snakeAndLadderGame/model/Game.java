package snakeAndLadderGame.model;

import java.util.Date;
import java.util.List;

public class Game {

	int id;

	Board board;

	List<PlayerState> playerState;

	Date startTime;

	Date endTime;

	Player winner;

	public Game(int id, Board board, List<PlayerState> playerState, Date startTime, Date endTime) {
		this.id = id;
		this.board = board;
		this.playerState = playerState;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public List<PlayerState> getPlayerState() {
		return playerState;
	}

	public void setPlayerState(List<PlayerState> playerState) {
		this.playerState = playerState;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}
