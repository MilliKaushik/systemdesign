package tictactoe;

import java.util.concurrent.Callable;

public class PlayerMoveRequestTask implements Callable<Move> {

	PlayerConnectionManagerService playerConnectionManagerService;

	Player player;

	Board board;

	public PlayerMoveRequestTask(Player player, Board board) {
		this.player = player;
		this.board = board;
	}

	@Override
	public Move call() throws Exception {
		PlayerConnection playerConnection = playerConnectionManagerService.getPlayerConnection(player);
		playerConnection.sendMessage(message);
		return move;
	}

}
