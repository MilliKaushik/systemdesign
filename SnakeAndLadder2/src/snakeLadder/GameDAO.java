package snakeLadder;

import java.util.HashMap;
import java.util.Map;

public class GameDAO {

	private Map<Integer, Game> games;

	public GameDAO() {
		games = new HashMap<>();
	}

	public void save(Game game) {
		games.put(game.getId(), game);
	}

	public Game getGame(int id) {
		return games.get(id);
	}

	public void update(Game game) {
		games.put(game.getId(), game);
	}

}
