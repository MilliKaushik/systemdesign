package tictactoe;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class PlayerMoveManager {

	PlayerConnectionManagerService playerConnectionManagerService;

	PlayerService playerService;

	ExecutorService executorService = Executors.newFixedThreadPool(2);

	public Position makePlayerValidMoveRequest(Player player, Board board) throws PlayerMoveTimeoutException {
		PlayerService playerService = playerConnectionManagerService.getPlayerService(player);
		PlayerMoveRequestTask task = new PlayerMoveRequestTask(playerService, player, board);
		Future<Position> futurePosition = executorService.submit(task);
		Position position = null;

		// if player doesn't respond in 10 seconds, cancel the task
		try {
			position = futurePosition.get(10000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
			futurePosition.cancel(true);
			throw new PlayerMoveTimeoutException("Player didn't respond on time");
		}

		return position;
	}
}
