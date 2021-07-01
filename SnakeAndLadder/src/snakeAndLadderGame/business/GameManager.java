package snakeAndLadderGame.business;

import java.util.Date;
import java.util.Random;

import snakeAndLadderGame.BoardStatus;
import snakeAndLadderGame.model.Board;
import snakeAndLadderGame.model.Game;
import snakeAndLadderGame.model.Player;
import snakeAndLadderGame.model.PlayerState;

public class GameManager {

	private static final int MAX_DICE_NUMBER = 6;

	GameStatusUpdater gameStatusUpdated;

	private Random random;

	public GameManager(Random random, GameStatusUpdater gameStatusUpdated) {
		this.random = new Random();
		this.gameStatusUpdated = gameStatusUpdated;
	}

	// conducts game
	public void play(Game game) {
		int turn = 0;

		// considering only two player game
		while (game.getBoard().getBoardStatus().equals(BoardStatus.ONGOING)) {
			PlayerState playerState = game.getPlayerState().get(0);
			Board board = game.getBoard();
			int diceNumber = getDiceNumber();
			gameStatusUpdated.updateGameStatus(board, playerState, diceNumber);
			turn = turn ^ 1;
		}
	}

	private int getDiceNumber() {
		return random.nextInt(MAX_DICE_NUMBER) + 1;
	}

	public void endGame(Game game, Player player) {
		game.getBoard().setBoardStatus(BoardStatus.ENDED);
		game.setWinner(player);
		game.setEndTime(new Date());
	}
}
