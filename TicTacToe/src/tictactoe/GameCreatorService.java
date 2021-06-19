package tictactoe;

import java.util.List;

public class GameCreatorService {

	PlayerConnectionManagerService playerConnectionManagerService;

	PlayerService playerService;

	public Game createGame(List<Player> players) {
		players.get(0).setPlayerSymbol(PlayerSymbol.CROSS);
		players.get(1).setPlayerSymbol(PlayerSymbol.CIRCLE);
		// create a new game
		// send players information about the symbols assigned to them
		for (Player p : players) {
			playerService = playerConnectionManagerService.getPlayerService(p);
			playerService.notifySymbolToPlayer(p);
		}
		return null;
	}
}
