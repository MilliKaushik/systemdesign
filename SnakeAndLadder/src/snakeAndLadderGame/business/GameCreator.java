package snakeAndLadderGame.business;

import java.util.Arrays;
import java.util.Date;

import snakeAndLadderGame.model.Board;
import snakeAndLadderGame.model.Cell;
import snakeAndLadderGame.model.Game;
import snakeAndLadderGame.model.GameRequest;
import snakeAndLadderGame.model.Player;
import snakeAndLadderGame.model.PlayerState;

public class GameCreator {

	private static int noOfOngoingGames = 0;

	private BoardCreator boardCreator;

	private PlayerManager playerService;

	public GameCreator(BoardCreator boardCreator, PlayerManager playerService) {
		this.boardCreator = boardCreator;
		this.playerService = playerService;
	}

	public Game createGame(GameRequest gameRequest1, GameRequest gameRequest2) {
		Board board = boardCreator.createBoard();
		Player player1 = playerService.getPlayer(gameRequest1.getPlayerId());
		Player player2 = playerService.getPlayer(gameRequest2.getPlayerId());

		PlayerState playerState1 = new PlayerState(player1, new Cell(0, 0));
		PlayerState playerState2 = new PlayerState(player2, new Cell(0, 0));

		noOfOngoingGames++;
		Game game = new Game(noOfOngoingGames, board, Arrays.asList(playerState1, playerState2), new Date(), null);

		return game;
	}
}
