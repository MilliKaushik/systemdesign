package tictactoe;

import java.util.Date;

public class GameManager {

	private static final int RETRY_ATTEMPT = 3;

	PlayerService playerService;

	MoveValidityChecker moveValidityChecker;

	GameStatusChecker gameStatusChecker;

	public void play(Game game) {
		Board board = game.getBoard();
		int i = 0;

		// while gamesttauschecker in progress
		while (board.getBoardState() == BoardStatus.ONGOING) {
			Player currentPlayer = game.getPlayers().get(i);
			Move pos = null;

			int count = RETRY_ATTEMPT;

			while (pos == null && count-- != 0)
				try {
					pos = playerService.getPlayerMove(currentPlayer, board);
				} catch (PlayerMoveTimeoutException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			// try -catch handle invalidmoveexception here
//			try {
//		        moveValidityChecker.isValidMove(currentPlayer, pos);
//		    	pos = null;
//		    } catch(Invalid)
//		

			// NoResponseFromPlayerException
//		} catch (PlayerMoveTimeoutException e) {
//			e.printStackTrace();
//			hasEnded = true;

			// update game status method
			if (gameStatusChecker.checkIfWinningMove(game, currentPlayer, pos)) {
				hasEnded = true;
				game.setWinner(currentPlayer);
				endGame(game, BoardStatus.ENDED_SUCCESS);
			}

			// if game ended but we don't have a winner
			if (gameStatusChecker.checkIfGameEnded(game)) {
				hasEnded = true;
				endGame(game, BoardStatus.ENDED_INVALID);
			}

		}
//alternate between the two players
		if (i == 0)
			i = 1;
		else if (i == 1)
			i = 0;
	}

	public void endGame(Game game, BoardStatus gameStatus) {
		game.setEndTime(new Date());
		game.setGameStatus(gameStatus);
	}
}
