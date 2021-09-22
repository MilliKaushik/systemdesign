package snakeLadder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

	private Map<Integer, Snake> snakePositions;

	private Map<Integer, Ladder> ladderPositions;

	private Map<String, PlayerPosition> playerPositions;

	public Board(List<Snake> snakes, List<Ladder> ladders, List<Player> players) {
		Map<Integer, Snake> snakePositions = new HashMap<>();
		for (Snake snake : snakes)
			snakePositions.put(snake.getStartPosition(), snake);
		this.snakePositions = snakePositions;

		Map<Integer, Ladder> ladderPositions = new HashMap<>();
		for (Ladder ladder : ladders)
			ladderPositions.put(ladder.getStartPosition(), ladder);
		this.ladderPositions = ladderPositions;

		Map<String, PlayerPosition> playerPositions = new HashMap<>();
		for (Player player : players) {
			PlayerPosition playerPosition = new PlayerPosition(player.getName(), 0);
			playerPositions.put(player.getName(), playerPosition);
		}
		this.playerPositions = playerPositions;
	}

	public Map<Integer, Snake> getSnakePositions() {
		return snakePositions;
	}

	public void setSnakePositions(Map<Integer, Snake> snakePositions) {
		this.snakePositions = snakePositions;
	}

	public Map<Integer, Ladder> getLadderPositions() {
		return ladderPositions;
	}

	public void setLadderPositions(Map<Integer, Ladder> ladderPositions) {
		this.ladderPositions = ladderPositions;
	}

	public Map<String, PlayerPosition> getPlayerPositions() {
		return playerPositions;
	}

	public void setPlayerPositions(Map<String, PlayerPosition> playerPositions) {
		this.playerPositions = playerPositions;
	}

}
