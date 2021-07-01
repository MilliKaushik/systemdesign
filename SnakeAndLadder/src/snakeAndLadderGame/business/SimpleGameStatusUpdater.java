package snakeAndLadderGame.business;

import java.util.List;

import snakeAndLadderGame.model.Board;
import snakeAndLadderGame.model.Cell;
import snakeAndLadderGame.model.Ladder;
import snakeAndLadderGame.model.PlayerState;
import snakeAndLadderGame.model.Snake;

public class SimpleGameStatusUpdater implements GameStatusUpdater {

	@Override
	public void updateGameStatus(Board board, PlayerState playerState, int diceVal) {
		Cell newCell = updateBoardStatus(board, playerState, diceVal);
	}

	private Cell updateBoardStatus(Board board, PlayerState playerState, int diceVal) {
		Cell newPlayerCell = getNewPlayerPosition(board, playerState, diceVal);
		List<Ladder> ladders = board.getLadders();
		for (Ladder ladder : ladders)
			if (ladder.getStCell().equals(newPlayerCell)) {
				newPlayerCell = ladder.getEndCell();
				return newPlayerCell;
			}

		List<Snake> snakes = board.getSnakes();
		for (Snake snake : snakes)
			if (snake.getStCell().equals(newPlayerCell)) {
				newPlayerCell = snake.getEndCell();
				return newPlayerCell;
			}
		return newPlayerCell;
	}

	private Cell getNewPlayerPosition(Board board, PlayerState playerState, int diceVal) {
		playerState.getPlayerCurrentCell();
		int row = playerState.getPlayerCurrentCell().getRow();
		int col = playerState.getPlayerCurrentCell().getCol();
		int newRow, newCol;
		int boardLength = board.getBoardLength();
		if (col + diceVal >= 10) {
			newRow = ++row;
			newCol = diceVal - (boardLength - row);
		} else {
			newRow = row;
			newCol = col + diceVal;
		}
		Cell newCell = new Cell(newRow, newCol);
		return newCell;
	}
}
