package tictactoe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Game {

	private int id;

	private List<PlayerSymbol> playerSymbols;

	private Date creationTime;

	private Date endTime;

	private List<Move> moves;

	private Symbol[][] board;

	private GameStatus gameStatus;

	private int winnerPlayerId;

	public Game(List<PlayerSymbol> playerSymbols, Date creationTime, int boardSize) {
		this.playerSymbols = playerSymbols;
		this.creationTime = creationTime;
		this.moves = new ArrayList<>();
		this.gameStatus = GameStatus.STARTED;
		board = new Symbol[boardSize][boardSize];
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<PlayerSymbol> getPlayerSymbols() {
		return playerSymbols;
	}

	public void setPlayerSymbols(List<PlayerSymbol> playerSymbols) {
		this.playerSymbols = playerSymbols;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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

	public int getWinnerPlayerId() {
		return winnerPlayerId;
	}

	public void setWinnerPlayerId(int winnerPlayerId) {
		this.winnerPlayerId = winnerPlayerId;
	}

}
