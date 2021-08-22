package tictactoe;

import java.util.List;

public class MoveValidator {

	public void validate(Game game, Move move) throws InvalidMoveException {
		Move lastMoveOfPlayer = fetchLastMoveOfPlayer(game, move.getPlayerSymbol().getPlayerId());
		if (lastMoveOfPlayer == null)
			return;
		if (lastMoveOfPlayer.equals(move))
			throw new InvalidMoveException("Invalid move");
		int row = move.getPosition().getRow();
		int col = move.getPosition().getCol();
		Symbol[][] board = game.getBoard();
		if (!board[row][col].equals(Symbol.EMPTY))
			throw new InvalidMoveException("Invalid move");
	}

	private Move fetchLastMoveOfPlayer(Game game, int playerId) {
		List<Move> moves = game.getMoves();
		for (int i = moves.size() - 1; i >= 0; i--) {
			if (moves.get(i).getPlayerSymbol().getPlayerId() == playerId)
				return moves.get(i);
		}
		return null;
	}

}
