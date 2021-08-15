package tictactoe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Game {

	private static int BOARD_SIZE = 3;

	private int id;

	private int playerId1;

	private int playerId2;

	private Date creationTime;

	private Date updateTime;

	private List<Move> moves;

	private Symbol[][] board;

	private GameStatus gameStatus;

	public Game(int playerId1, int playerId2, Date creationTime, Date updateTime) {
		this.playerId1 = playerId1;
		this.playerId2 = playerId2;
		this.creationTime = creationTime;
		this.updateTime = updateTime;
		this.moves = new ArrayList<>();
		this.board = new Symbol[BOARD_SIZE][BOARD_SIZE];
		this.gameStatus = GameStatus.STARTED;
	}

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

	public int getPlayerId2() {
		return playerId2;
	}

	public void setPlayerId2(int playerId2) {
		this.playerId2 = playerId2;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public List<Move> getMoves() {
		return moves;
	}

	public void setMoves(List<Move> moves) {
		this.moves = moves;
	}

	public Symbol[][] getBoard() {
		return board;
	}

	public void setBoard(Symbol[][] board) {
		this.board = board;
	}

	public GameStatus getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(GameStatus gameStatus) {
		this.gameStatus = gameStatus;
	}

}
