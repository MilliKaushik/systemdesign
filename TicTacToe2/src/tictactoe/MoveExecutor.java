package tictactoe;

public class MoveExecutor {

	public void executeMove(Game game, Move move) {
		game.getMoves().add(move);
		int row = move.getPosition().getRow();
		int col = move.getPosition().getCol();
		Symbol[][] board = game.getBoard();
		board[row][col] = move.getPlayerSymbol().getSymbol();
	}

}
