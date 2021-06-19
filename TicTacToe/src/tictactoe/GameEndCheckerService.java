package tictactoe;

import java.util.List;

public class GameEndCheckerService {

	private static final int BOARD_SIZE = 3;

	public boolean checkIfGameEnded(Game game) {
		Board board = game.getBoard();
		List<List<PositionState>> boardState = board.getBoardState();
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++)
				if (boardState.get(i).get(j).equals(PositionState.UNFILLED))
					return false;
		}
		return true;
	}

	//only thing left
	public boolean checkIfWinningMove(Game game, Player player, Position pos) {
		Board board = game.getBoard();
		List<List<PositionState>> boardState = board.getBoardState();
		int row = pos.getRow();
		int col = pos.getCol();

		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++)
				if (boardState.get(i).get(j).equals(PositionState.UNFILLED))
					return false;
		}
		return true;
	}
}
