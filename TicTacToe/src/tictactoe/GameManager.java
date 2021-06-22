package tictactoe;

import java.util.Date;
import java.util.List;

public class GameManager {

	private static final int RETRY_ATTEMPT = 3;

	PlayerService playerService;

	MoveValidityChecker moveValidityChecker;

	GameStatusUpdater gameStatusUpdater;

	public void notifyPlayers(Game game) {
		List<PlayerState> playerStates = game.getPlayerStates();

		for (PlayerState playerState : playerStates)
			playerService.notifyGameInfoToPlayer(game, playerState);
	}

	public void play(Game game) {
		Board board = game.getBoard();

		int i = 0;
		// while gameStatusChecker in progress
		while (board.getBoardStatus().equals(BoardStatus.ONGOING)) {
			// Player currentPlayer = game.getPlayerStates().get(i).getPlayer();
			Move move = null;

			int count = RETRY_ATTEMPT;

			while (move == null && count-- > 0) {
				try {
					move = playerService.getPlayerMove(game, game.getPlayerStates().get(i));
					moveValidityChecker.isValidMove(game.getPlayerStates().get(i), move);
				} catch (PlayerMoveTimeoutException | InvalidMoveException ex) {
					count--;
					move = null;
					handle(game, count, ex);
				}
			}
			gameStatusUpdater.updateBoard(game, game.getPlayerStates().get(i).getPlayer(), move);

			if (game.getBoard().getBoardStatus().equals(BoardStatus.NO_DRAW)) {
				System.out.println("The winner is " + game.getWinner());
				return;
			} else if (game.getBoard().getBoardStatus().equals(BoardStatus.DRAW)) {
				System.out.println("The game is drawn!");
				return;
			}

			i = i ^ 1;
		}
		// alternate between the two players
		// if arguments are same, xor gives result as false or 0, if arguments are
		// different, only then xor gives result as true or 1
	}

	private void handle(Game game, int count, PlayerMoveException ex) {
		if (count <= 0) 
			endGame(game, BoardStatus.DRAW);
	}

	public void endGame(Game game, BoardStatus boardStatus) {
		game.setEndTime(new Date());
		game.getBoard().setBoardStatus(boardStatus);
	}
}
