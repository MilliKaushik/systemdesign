package tictactoe;

import java.util.concurrent.Callable;

public class PlayerMoveRequestTask implements Callable<Position> {

	PlayerService playerService;

	Player player;

	Board board;

	public PlayerMoveRequestTask(PlayerService playerService, Player player, Board board) {
		this.playerService = playerService;
		this.player = player;
		this.board = board;
	}

	@Override
	public Position call() throws Exception {
		Position position = playerService.requestPlayerForMove(player, board);
		return position;
	}

}
