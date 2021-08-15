package tictactoe;

import java.util.Date;

public class GameService {

	private GameDAO gameDAO;

	public int createGame(GameRequest gameRequest) {
		Game game = new Game(gameRequest.getPlayerId1(), gameRequest.getPlayerId2(), new Date(), new Date());
		int gameId = gameDAO.createGame(game);
		return gameId;
	}

	public void updateGame(Game game) {

	}

	public Game getGame(int id) {
		return gameDAO.getGame(id);
	}

	public void endGame(int gameId) {
Game game = getGame(gameId);
game.setGameStatus(GameStatus);
	}
}
