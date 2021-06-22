package tictactoe;

import java.util.List;
import java.util.Date;

public class GameStatusUpdater {

	private static final int BOARD_SIZE = 3;

	public void updateBoard(Game game, Player player, Move move) {
		TicTacToeSymbol currSymbol = game.getBoard().getBoardState().get(move.getRow()).get(move.getCol());
		List<List<TicTacToeSymbol>> boardState = game.getBoard().getBoardState();
		if (checkIfWinningMove(boardState, move, currSymbol)) {
			game.getBoard().setBoardStatus(BoardStatus.NO_DRAW);
			game.setWinner(player);
			game.setEndTime(new Date());
		}

		if (checkIfGameEnded(game, move)) {
			game.getBoard().setBoardStatus(BoardStatus.DRAW);
			game.setEndTime(new Date());
		}
	}

	private boolean checkIfGameEnded(Game game, Move move) {
		List<List<TicTacToeSymbol>> boardState = game.getBoard().getBoardState();
		for (int i = 0; i < BOARD_SIZE; i++)
			for (int j = 0; j < BOARD_SIZE; j++)
				if (boardState.get(i).get(j).equals(TicTacToeSymbol.UNFILLED))
					return false;
		return true;
	}

	private boolean checkIfWinningMove(List<List<TicTacToeSymbol>> boardState, Move move, TicTacToeSymbol currSymbol) {
		if (horizontalFill(boardState, move, currSymbol))
			return true;
		if (verticalFill(boardState, move, currSymbol))
			return true;
		if (diagonalFill(boardState, move, currSymbol))
			return true;
		return false;
	}

	// https://stackoverflow.com/questions/1056316/algorithm-for-determining-tic-tac-toe-game-over
	private boolean diagonalFill(List<List<TicTacToeSymbol>> boardState, Move move, TicTacToeSymbol currSymbol) {
		int row = move.getRow();
		int col = move.getCol();
		// check diagonal
		if (row == col) {
			for (int i = 0; i < BOARD_SIZE; i++)
				if (!(boardState.get(i).get(i)).equals(currSymbol))
					break;
		}
		// check anti diagonal
		if ((row + col) == BOARD_SIZE - 1) {
			for (int i = 0; i < BOARD_SIZE; i++)
				if (!(boardState.get(i).get(BOARD_SIZE - i - 1)).equals(currSymbol))
					break;
		}
		return true;
	}

	private boolean horizontalFill(List<List<TicTacToeSymbol>> boardState, Move move, TicTacToeSymbol currSymbol) {
		int row = move.getRow();
		for (int i = 0; i < BOARD_SIZE; i++)
			if (!boardState.get(row).get(i).equals(currSymbol))
				return false;
		return true;
	}

	private boolean verticalFill(List<List<TicTacToeSymbol>> boardState, Move move, TicTacToeSymbol currSymbol) {
		int col = move.getCol();
		for (int i = 0; i < BOARD_SIZE; i++)
			if (!boardState.get(i).get(col).equals(currSymbol))
				return false;
		return true;
	}
}
