package tictactoe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameService {

	private MoveValidator moveValidator;

	private MoveExecutor moveExecutor;

	private GameWinOrDrawHandler gameWinOrDrawHandler;

	public Game createGame(GameRequest gameRequest) {
		List<PlayerSymbol> playerSymbols = new ArrayList<>();
		playerSymbols.add(new PlayerSymbol(gameRequest.getPlayerId1(), gameRequest.getP1Symbol()));
		playerSymbols.add(new PlayerSymbol(gameRequest.getPlayerId2(), gameRequest.getP2Symbol()));
		Game game = new Game(playerSymbols, new Date(), gameRequest.getBoardSize());
		printBoard(game.getBoard());
		return game;
	}

	public void playGameMove(Game game, Move move) throws InvalidMoveException {
		moveValidator.validate(game, move);
		moveExecutor.executeMove(game, move);
		printBoard(game.getBoard());
		gameWinOrDrawHandler.handleWinOrDraw(game);
		GameStatus gameStatus = game.getGameStatus();
		if (gameStatus.equals(GameStatus.DRAW) || gameStatus.equals(GameStatus.WON))
			endGame(game);
	}

	public void endGame(Game game) {
		game.setEndTime(new Date());
	}

	private void printBoard(Symbol[][] board) {
		int n = board.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				switch (board[i][j]) {
				case EMPTY:
					System.out.print(" - ");
					break;
				case NOUGHT:
					System.out.print(" o ");
					break;
				case CROSS:
					System.out.print(" x ");
					break;
				}
				System.out.println();
			}
		}
	}

}
