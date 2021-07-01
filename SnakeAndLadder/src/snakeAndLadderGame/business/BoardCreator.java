package snakeAndLadderGame.business;

import snakeAndLadderGame.model.Board;

public class BoardCreator {

	private static int BOARD_LENGTH = 10;

	private static int NO_OF_LADDERS = 4;

	private static int NO_OF_SNAKES = 4;

	private LadderCreator ladderCreator;

	private SnakeCreator snakeCreator;

	public Board createBoard() {
		Board board = new Board(BOARD_LENGTH, NO_OF_LADDERS, NO_OF_SNAKES);
		ladderCreator.createLadders(board);
		snakeCreator.createSnakes(board);
		return board;
	}
}
