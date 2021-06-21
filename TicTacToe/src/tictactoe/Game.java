package tictactoe;

import java.util.Date;
import java.util.List;

public class Game {

	int id;

	List<PlayerState> playerStates;

	Date beginTime;

	Date endTime;

	Player winner;

	Board board;

	public Game(List<PlayerState> playerStates, Date beginTime, Board board) {
		this.playerStates = playerStates;
		this.beginTime = beginTime;
		this.board = board;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
}
