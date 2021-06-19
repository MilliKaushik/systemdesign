package tictactoe;

import java.util.Date;

public class GameManagerService {

	PlayerMoveManager playerMoveManager;

	MoveValidityChecker moveValidityChecker;

	GameEndCheckerService gameEndCheckerService;

	public void play(Game game) throws InvalidMoveException {
		boolean hasEnded = false;

		Board board = game.getBoard();
		int i = 0;
		while (!hasEnded) {
			Player currentPlayer = game.getPlayers().get(i);
			Position pos = null;
			try {

				int count = 3;
				while (count-- != 0) {
					pos = playerMoveManager.makePlayerValidMoveRequest(currentPlayer, board);
				}
				if (count < 0)
					throw new InvalidMoveException("Player moved an invalid move");

				if (gameEndCheckerService.checkIfWinningMove(game, currentPlayer, pos)) {
					hasEnded = true;
					game.setWinner(currentPlayer);
					endGame(game, GameStatus.ENDED_SUCCESS);
				}

				// if game ended but we don't have a winner
				if (gameEndCheckerService.checkIfGameEnded(game)) {
					hasEnded = true;
					endGame(game, GameStatus.ENDED_INVALID);
				}

			} catch (PlayerMoveTimeoutException e) {
				e.printStackTrace();
				hasEnded = true;
			}
//alternate between the two players
			if (i == 0)
				i = 1;
			else if (i == 1)
				i = 0;
		}
	}

	public void endGame(Game game, GameStatus gameStatus) {
		game.setEndTime(new Date());
		game.setGameStatus(gameStatus);
	}
}
