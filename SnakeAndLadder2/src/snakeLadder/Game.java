package snakeLadder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Game {

	private String id;

	private Date startTime;

	private Date endTime;

	private GameStatus gameStatus;

	private Board board;

	private String winner;

	private List<Move> moves;

	private List<Player> players;

	public Game(Board board, List<Player> players) {
		this.id = UUID.randomUUID().toString();
		this.board = board;
		this.players = players;
		this.gameStatus = GameStatus.STARTED;
		this.startTime = new Date();
		moves = new ArrayList<>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public GameStatus getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(GameStatus gameStatus) {
		this.gameStatus = gameStatus;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public List<Move> getMoves() {
		return moves;
	}

	public void setMoves(List<Move> moves) {
		this.moves = moves;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}
