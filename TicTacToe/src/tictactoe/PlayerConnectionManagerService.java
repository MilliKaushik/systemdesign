package tictactoe;

import java.util.Map;

public class PlayerConnectionManagerService {

	Map<Player, PlayerConnection> playerConnectionMap; // might be fetching connections from db

	public PlayerConnection getPlayerConnection(Player player) {
		return playerConnectionMap.get(player);
	}

	public void createPlayerConnection(Player player) {
		PlayerConnection playerConnection = new PlayerConnection();
		playerConnectionMap.put(player, playerConnection);
	}
}
