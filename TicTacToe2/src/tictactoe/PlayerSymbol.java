package tictactoe;

public class PlayerSymbol {

	private int playerId;

	private Symbol symbol;

	public PlayerSymbol(int playerId, Symbol symbol) {
		this.playerId = playerId;
		this.symbol = symbol;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public Symbol getSymbol() {
		return symbol;
	}

	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}

}
