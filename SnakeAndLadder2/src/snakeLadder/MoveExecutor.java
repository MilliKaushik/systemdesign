package snakeLadder;

public class MoveExecutor {
	private static final int MAX = 100;

	public void executeMove(Game game, Move move) {
		int endPosition = move.getStartPos() + move.getDiceValue().getVal();
		if (endPosition > MAX) {
			System.out.println(move.getPlayerName() + " rolled a " + move.getDiceValue().getVal()
					+ " which is invalid as the end position is " + endPosition);
			return;
		}

		PlayerPosition playerPosition = game.getBoard().getPlayerPositions().get(move.getPlayerName());
		setPlayerPosition(playerPosition, endPosition);

		applySnake(playerPosition, game.getBoard());
		applyLadder(playerPosition, game.getBoard());

		move.setEndPos(playerPosition.getPosition());
		game.getMoves().add(move);

		if (move.getEndPos() == MAX) {
			game.setWinner(move.getPlayerName());
			game.setGameStatus(GameStatus.WON);
			System.out.println(move.getPlayerName() + " wins the game");
			return;
		}

		System.out.println(move.getPlayerName() + " rolled a " + move.getDiceValue().getVal() + " and moved from "
				+ move.getStartPos() + " to " + move.getEndPos());
		System.out.println();
	}

	private void applySnake(PlayerPosition playerPosition, Board board) {
		int currentPosition = playerPosition.getPosition();
		if (board.getSnakePositions().containsKey(currentPosition)) {
			int snakeEndPosition = board.getSnakePositions().get(currentPosition).getEndPosition();
			setPlayerPosition(playerPosition, snakeEndPosition);
		}
	}

	private void applyLadder(PlayerPosition playerPosition, Board board) {
		int currentPosition = playerPosition.getPosition();
		if (board.getLadderPositions().containsKey(currentPosition)) {
			int ladderEndPosition = board.getLadderPositions().get(currentPosition).getEndPosition();
			setPlayerPosition(playerPosition, ladderEndPosition);
		}
	}

	private void setPlayerPosition(PlayerPosition playerPosition, int endPosition) {
		playerPosition.setPosition(endPosition);
	}

}
