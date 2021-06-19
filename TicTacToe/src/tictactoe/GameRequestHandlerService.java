package tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class GameRequestHandlerService {

	PlayerConnectionManagerService playerConnectionManagerService;

	PlayerService playerService;

	GameCreatorService gameCreatorService;

	GameManagerService gameManagerService;

	public void requestPlay(Player player) {
		LinkedBlockingQueue<Player> queue = new LinkedBlockingQueue<>(10);

		while (queue.size() >= 2) {
			Player p1 = queue.remove();
			Player p2 = queue.remove();

			List<Player> players = new ArrayList<>();
			players.add(p1);
			players.add(p2);
			for (Player p : players)
				playerConnectionManagerService.createPlayerService(p);
			Game game = gameCreatorService.createGame(players);
			try {
				gameManagerService.play(game);
			} catch (InvalidMoveException e) {
				e.printStackTrace();
				gameManagerService.endGame(game, GameStatus.ENDED_INVALID);
			}
		}
	}
}
