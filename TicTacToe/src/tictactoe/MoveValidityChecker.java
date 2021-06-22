package tictactoe;

import java.util.List;

public class MoveValidityChecker {

	public void isValidMove(PlayerState playerState, Move move) throws InvalidMoveException {
		Board latestBoard = playerState.getGame().getBoard();
		List<List<TicTacToeSymbol>> boardPositions = latestBoard.getBoardState();

		int row = move.getRow();
		int col = move.getCol();

		TicTacToeSymbol symbol = boardPositions.get(row).get(col);
		if (!symbol.equals(TicTacToeSymbol.UNFILLED))
			throw new InvalidMoveException("No move made!");
		if (symbol.equals(playerState.getTicTacToeSymbol()))
			throw new InvalidMoveException("Incorrect move made!");
	}
}
