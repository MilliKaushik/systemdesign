package tictactoe;

public class GameRequest {

	private int playerId1;

	private int playerId2;

	private Symbol p1Symbol;

	private Symbol p2Symbol;

	private int boardSize;

	public int getPlayerId1() {
		return playerId1;
	}

	public void setPlayerId1(int playerId1) {
		this.playerId1 = playerId1;
	}

	public int getPlayerId2() {
		return playerId2;
	}

	public void setPlayerId2(int playerId2) {
		this.playerId2 = playerId2;
	}

	public Symbol getP1Symbol() {
		return p1Symbol;
	}

	public void setP1Symbol(Symbol p1Symbol) {
		this.p1Symbol = p1Symbol;
	}

	public Symbol getP2Symbol() {
		return p2Symbol;
	}

	public void setP2Symbol(Symbol p2Symbol) {
		this.p2Symbol = p2Symbol;
	}

	public int getBoardSize() {
		return boardSize;
	}

	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}

}
