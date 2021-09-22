package snakeLadder;

import java.util.Date;

public class GameService {

	private GameDAO gameDAO;

	private DiceRoller diceRoller;

	private MoveExecutor moveExecutor;

	private MoveCreator moveCreator;

	public GameService(GameDAO gameDAO, DiceRoller diceRoller, MoveExecutor moveExecutor, MoveCreator moveCreator) {
		this.gameDAO = gameDAO;
		this.diceRoller = diceRoller;
		this.moveExecutor = moveExecutor;
		this.moveCreator = moveCreator;
	}

	public Game createGame(GameRequest gameRequest) {
		Board board = new Board(gameRequest.getSnakes(), gameRequest.getLadders(), gameRequest.getPlayers());
		Game game = new Game(board, gameRequest.getPlayers());
		gameDAO.save(game);
		return game;
	}

	public void playGame(Game game) {
		game.setGameStatus(GameStatus.IN_PROGRESS);
		int turn = 0;
		int noOfPlayers = game.getPlayers().size();

		while (game.getGameStatus().equals(GameStatus.IN_PROGRESS)) {
			DiceValue diceValue = diceRoller.rollDice();
			Move move = moveCreator.createMove(game, diceValue, turn);
			moveExecutor.executeMove(game, move);
			turn = getNextTurn(turn, noOfPlayers);
//			System.out.println(
//					"Turn " + turn + " of the player " + move.getPlayerName() + " position " + move.getEndPos());
		}
	}

	private int getNextTurn(int turn, int noOfPlayers) {
		turn++;
		turn %= noOfPlayers;
		return turn;
	}

	public void endGame(String gameId) {
		Game game = getGame(gameId);
		game.setEndTime(new Date());
		gameDAO.update(game);
	}

	public Game getGame(String gameId) {
		return gameDAO.getGame(gameId);
	}
}
