package tictactoe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PlayerService {

	PlayerConnectionManagerService playerConnectionManagerService;

	MessageCreator messageCreator;

	ExecutorService executorService = Executors.newFixedThreadPool(2);

	public Move getPlayerMove(Game game, PlayerState playerState) throws PlayerMoveTimeoutException {
		PlayerConnection playerConnection = playerConnectionManagerService.getPlayerConnection(playerState.getPlayer());
		Message message = messageCreator.createMessage(MessageAction.REQUEST_MOVE, game, playerState);
		playerConnection.sendMessage(message);

		// listen for message from this player connection and send back
		// this method is synchronous and blocking in nature
//when you receive message from this connection/session send back the response
		Move move = null;

		return move;
	}

	public void notifyGameInfoToPlayer(Game game, PlayerState playerState) {
		PlayerConnection playerConnection = playerConnectionManagerService.getPlayerConnection(playerState.getPlayer());

		Message message = messageCreator.createMessage(MessageAction.INIT, game, playerState);
		playerConnection.sendMessage(message);
	}

	public Player getPlayer(int playerId) {
		return null;
	}
}
