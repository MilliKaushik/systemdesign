package tictactoe;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class PlayerService {
	
	ExecutorService executorService = Executors.newFixedThreadPool(2);

	public Move getPlayerMove(Player player, Board board) throws PlayerMoveTimeoutException {
		PlayerMoveRequestTask task = new PlayerMoveRequestTask(player, board);
		Future<Move> futurePosition = executorService.submit(task);
		Move position = null;

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

	public void notifyGameInfoToPlayer(Player player) {
//you have been assigned this symbol and this is the game id
	}

	public Player getPlayer(int playerId) {
		return null;
	}
}
