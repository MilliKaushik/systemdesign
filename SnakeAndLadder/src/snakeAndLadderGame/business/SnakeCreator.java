package snakeAndLadderGame.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import snakeAndLadderGame.model.Board;
import snakeAndLadderGame.model.Cell;
import snakeAndLadderGame.model.Snake;

public class SnakeCreator {

	private Random random;

	public SnakeCreator() {
		this.random = new Random();
	}

	public void createSnakes(Board board) {
		List<Snake> snakes = new ArrayList<>();
		int noOfSnakes = board.getNoOfSnakes();
		int boardLength = board.getBoardLength();
		// ladder row end cannot be 0 row
		while (noOfSnakes-- != 0) {
			// mouth of snake resides in st
			int snakeRowSt = random.nextInt(boardLength - 1) + 1;
			int snakeColSt = random.nextInt(boardLength);
			Cell stCell = new Cell(snakeRowSt, snakeColSt);

			int snakeRowEnd = random.nextInt(snakeRowSt - 1);
			int snakeColEnd = random.nextInt(boardLength);
			Cell endCell = new Cell(snakeRowEnd, snakeColEnd);

			Snake snake = new Snake(stCell, endCell);
			if (snakes.contains(snake)) {
				noOfSnakes++;
				continue;
			}
			snakes.add(snake);
		}
		board.setSnakes(snakes);
	}
}
