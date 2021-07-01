package snakeAndLadderGame.business;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import snakeAndLadderGame.model.Game;
import snakeAndLadderGame.model.GameRequest;

//should be singleton
//multiple ways of achieving thread safety
//https://www.baeldung.com/java-singleton-double-checked-locking
//double checked locking, early init, lazy init, enum
public class SimpleGameFacilitator implements GameFacilitator {
	private static final int MAX_NO_OF_GAME_REQUESTS = 100;

	private GameCreator gameCreator;

	private GameManager gameManager;

	private BlockingQueue<GameRequest> queue;

	private static volatile SimpleGameFacilitator simpleGameFacilitatorInstance;

	private SimpleGameFacilitator() {
		this.queue = new LinkedBlockingQueue<>(MAX_NO_OF_GAME_REQUESTS);
	}

	// double checked locking
	// To fix that, we could instead start by verifying if we need to create the
	// object in the first place and only in that case we would acquire the lock.
	public static SimpleGameFacilitator getInstance() {
		if (simpleGameFacilitatorInstance == null) {
			synchronized (SimpleGameFacilitator.class) {
				if (simpleGameFacilitatorInstance == null)
					simpleGameFacilitatorInstance = new SimpleGameFacilitator();
			}
		}
		return simpleGameFacilitatorInstance;
	}

	public void addToList(GameRequest gameRequest) {
		queue.add(gameRequest);
	}

	// creating a 2 player game
	public void facilitateGame() {
		GameRequest gameRequest1 = queue.remove();
		GameRequest gameRequest2 = queue.remove();

		Game game = gameCreator.createGame(gameRequest1, gameRequest2);
		gameManager.play(game);
	}
}
