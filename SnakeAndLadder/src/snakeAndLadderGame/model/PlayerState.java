package snakeAndLadderGame.model;

public class PlayerState {

	Player player;

	Cell playerCurrentCell;

	public PlayerState(Player player, Cell playerCurrentCell) {
		this.player = player;
		this.playerCurrentCell = playerCurrentCell;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Cell getPlayerCurrentCell() {
		return playerCurrentCell;
	}

	public void setPlayerCurrentCell(Cell playerCurrentCell) {
		this.playerCurrentCell = playerCurrentCell;
	}
}
