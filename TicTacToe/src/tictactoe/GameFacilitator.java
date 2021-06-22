package tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class GameFacilitator {

	private static final int MAX_SIZE = 100000;

	GameCreator gameCreator;

	GameManager gameManager;

	LinkedBlockingQueue<GameRequest> queue;

	// maintaining a list of games so that in case we want to access it later on
	// some dashboard to see all the games
	List<Game> ongoingGames;

	// singleton class - business reason - every person in world can interact with
	// each other, else we will have to do sharding, maybe if we shard user id, then
	// maybe some uniformity. As consistent hashing is deterministic, then
	// predictable. As message size is small, so can't be too big.
	public GameFacilitator(LinkedBlockingQueue<GameRequest> queue) {
		this.queue = new LinkedBlockingQueue<>();
		this.ongoingGames = new ArrayList<>();
	}

	public void addRequestToQueue(GameRequest gameRequest) throws Exception {
		if (queue.size() >= MAX_SIZE)
			throw new Exception("");
		queue.add(gameRequest);
	}

	// run in the background continuously - run every 30 seconds
	public void facilitateGames() {
		while (queue.size() >= 2) {

			// use id here, gameCreator will create players
			GameRequest gameRequest1 = queue.remove();
			GameRequest gameRequest2 = queue.remove();

			List<GameRequest> gameRequests = new ArrayList<>();
			gameRequests.add(gameRequest1);
			gameRequests.add(gameRequest2);

			Game game = gameCreator.createGame(gameRequest1, gameRequest2);
			gameManager.notifyPlayers(game);
			ongoingGames.add(game);

			gameManager.play(game);
		}
	}
}
