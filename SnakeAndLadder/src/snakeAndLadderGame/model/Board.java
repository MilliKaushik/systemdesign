package snakeAndLadderGame.model;

import java.util.List;

import snakeAndLadderGame.BoardStatus;

public class Board {

	List<Ladder> ladders;

	List<Snake> snakes;

	BoardStatus boardStatus;

	private int noOfLadders;

	private int noOfSnakes;

	private int boardLength;

	public Board(int noOfLadders, int noOfSnakes, int boardLength) {
		this.boardStatus = BoardStatus.CREATED;
		this.noOfLadders = noOfLadders;
		this.noOfSnakes = noOfSnakes;
		this.boardLength = boardLength;
	}

	public int getNoOfLadders() {
		return noOfLadders;
	}

	public void setNoOfLadders(int noOfLadders) {
		this.noOfLadders = noOfLadders;
	}

	public int getNoOfSnakes() {
		return noOfSnakes;
	}

	public void setNoOfSnakes(int noOfSnakes) {
		this.noOfSnakes = noOfSnakes;
	}

	public int getBoardLength() {
		return boardLength;
	}

	public void setBoardLength(int boardLength) {
		this.boardLength = boardLength;
	}

	public List<Ladder> getLadders() {
		return ladders;
	}

	public void setLadders(List<Ladder> ladders) {
		this.ladders = ladders;
	}

	public List<Snake> getSnakes() {
		return snakes;
	}

	public void setSnakes(List<Snake> snakes) {
		this.snakes = snakes;
	}

	public BoardStatus getBoardStatus() {
		return boardStatus;
	}

	public void setBoardStatus(BoardStatus boardStatus) {
		this.boardStatus = boardStatus;
	}

}
