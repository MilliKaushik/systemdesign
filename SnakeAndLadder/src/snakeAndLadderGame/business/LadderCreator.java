package snakeAndLadderGame.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import snakeAndLadderGame.model.Board;
import snakeAndLadderGame.model.Cell;
import snakeAndLadderGame.model.Ladder;

public class LadderCreator {

	private Random random;

	public LadderCreator() {
		random = new Random();
	}

//nextInt [0,n)	
	public void createLadders(Board board) {
		List<Ladder> ladders = new ArrayList<>();
		int noOfLadders = board.getNoOfLadders();
		int boardLength = board.getBoardLength();
		// ladder row end cannot be 0 row
		while (noOfLadders-- != 0) {
			int ladderRowEnd = random.nextInt(boardLength - 1) + 1;
			int ladderColEnd = random.nextInt(boardLength);
			Cell endCell = new Cell(ladderRowEnd, ladderColEnd);

			int ladderRowSt = random.nextInt(ladderRowEnd - 1);
			int ladderColSt = random.nextInt(ladderColEnd);
			Cell stCell = new Cell(ladderRowSt, ladderColSt);

			Ladder ladder = new Ladder(stCell, endCell);
			if (ladders.contains(ladder)) {
				noOfLadders++;
				continue;
			}
			ladders.add(ladder);
		}
		board.setLadders(ladders);
	}
}
