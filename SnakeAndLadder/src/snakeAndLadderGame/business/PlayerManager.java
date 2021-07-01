package snakeAndLadderGame.business;

import java.util.HashMap;
import java.util.Map;

import snakeAndLadderGame.model.Player;

public class PlayerManager {

	Map<Integer, Player> playerMapping;
	static int countOfPlayers;

	public PlayerManager(Map<Integer, Player> playerMapping) {
		this.playerMapping = new HashMap<>();
		countOfPlayers = 0;
	}

	public void addPlayer(int phoneNumber) {
		Player player = new Player(++countOfPlayers, phoneNumber);
		playerMapping.put(countOfPlayers, player);
	}

	public Player getPlayer(int id) {
		return playerMapping.get(id);
	}
}
