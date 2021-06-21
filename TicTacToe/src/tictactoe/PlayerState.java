package tictactoe;

public class PlayerState {

	Player player;

	Game game;

	TicTacToeSymbol ticTacToeSymbol;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public TicTacToeSymbol getTicTacToeSymbol() {
		return ticTacToeSymbol;
	}

	public void setTicTacToeSymbol(TicTacToeSymbol ticTacToeSymbol) {
		this.ticTacToeSymbol = ticTacToeSymbol;
	}

}
