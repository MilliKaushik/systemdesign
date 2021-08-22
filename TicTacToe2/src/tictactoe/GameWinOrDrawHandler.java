package tictactoe;

import java.util.List;

public class GameWinOrDrawHandler {

	public void handleWinOrDraw(Game game) {

		boolean hasWon = checkIfWin(game);
		if (hasWon) {
			game.setGameStatus(GameStatus.WON);
			return;
		}
		boolean hasDrawn = checkIfDraw(game);
		if (hasDrawn)
			game.setGameStatus(GameStatus.DRAW);
	}

	private boolean checkIfDraw(Game game) {
		Symbol[][] board = game.getBoard();
		int len = board.length;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (board[i][j].equals(Symbol.EMPTY))
					return false;
			}
		}
		return true;
	}

	private boolean checkIfWin(Game game) {
		if (horizontalCheckForWin(game))
			return true;
		if (verticalCheckForWin(game))
			return true;
		if (diagonalCheckForWin(game))
			return true;
		return false;
	}

	private boolean diagonalCheckForWin(Game game) {
		Symbol[][] board = game.getBoard();
		for (int i = 0; i < board.length; i++) {
			boolean allSameSymbol = true;
			Symbol rowStartSymbol = board[i][0];
			for (int j = 1; j < board.length; j++)
				if (board[i][j] != rowStartSymbol) {
					allSameSymbol = false;
					return false;
				}
			// we have found a winner
			if (allSameSymbol) {
				game.setWinnerPlayerId(getPlayerForSymbol(game, rowStartSymbol));
			}
		}
		return true;
	}

	private boolean verticalCheckForWin(Game game) {
		Symbol[][] board = game.getBoard();
		for (int j = 0; j < board.length; j++) {
			boolean allSameSymbol = true;
			Symbol rowStartSymbol = board[j][0];
			for (int i = 1; i < board.length; i++)
				if (board[i][j] != rowStartSymbol) {
					allSameSymbol = false;
					return false;
				}
			// we have found a winner
			if (allSameSymbol) {
				game.setWinnerPlayerId(getPlayerForSymbol(game, rowStartSymbol));
			}
		}
		return true;
	}

	private boolean horizontalCheckForWin(Game game) {
		Symbol[][] board = game.getBoard();
		for (int i = 0; i < board.length; i++) {
			boolean allSameSymbol = true;
			Symbol rowStartSymbol = board[i][0];
			for (int j = 1; j < board.length; j++)
				if (board[i][j] != rowStartSymbol) {
					allSameSymbol = false;
					return false;
				}
			// we have found a winner
			if (allSameSymbol) {
				game.setWinnerPlayerId(getPlayerForSymbol(game, rowStartSymbol));
			}
		}
		return true;
	}

	private int getPlayerForSymbol(Game game, Symbol rowStartSymbol) {
		List<PlayerSymbol> playerSymbols = game.getPlayerSymbols();
		for (PlayerSymbol playerSymbol : playerSymbols)
			if (playerSymbol.equals(rowStartSymbol))
				return playerSymbol.getPlayerId();
		return -1;
	}

}
