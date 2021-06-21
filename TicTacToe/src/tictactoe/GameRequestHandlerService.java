package tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class GameRequestHandlerService {

	GameCreator gameCreator;

	GameManager gameManager;

	// use gameRequest object where we also pass info about which piece the user has
	// chosen, maybe the algorithm can use location too to make game faster

	// Don't bring a model object that you fill in later as that is not good
	// practice, maybe someone fetches getSymbol here, use something like
	// gameRequest object and pass player Id
	public void requestPlay(GameRequest gameRequest) {
		LinkedBlockingQueue<GameRequest> queue = new LinkedBlockingQueue<>(10);
//this part can be moved to another class where we write the logic of selecting players in the 
		// nearby geographical location and maybe based on what symbol they selected
		while (queue.size() >= 2) {

			// use id here, gameCreator will create players
			GameRequest gameRequest1 = queue.remove();
			GameRequest gameRequest2 = queue.remove();

			List<GameRequest> gameRequests = new ArrayList<>();
			gameRequests.add(gameRequest1);
			gameRequests.add(gameRequest2);

			Game game = gameCreator.createGame(gameRequest1, gameRequest2);
			gameManager.play(game);
		}
	}
}
