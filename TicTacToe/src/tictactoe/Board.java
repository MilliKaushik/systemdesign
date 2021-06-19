package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private static final int BOARD_SIZE = 3;

	List<List<PositionState>> boardState;

	public Board() {
		boardState = new ArrayList<>();
		for (int i = 0; i < BOARD_SIZE; i++)
			for (int j = 0; j < BOARD_SIZE; j++)
				boardState.get(i).set(j, PositionState.UNFILLED);
	}

	public Board(Position position, PlayerSymbol playerSymbol) {
		if (playerSymbol.equals(PlayerSymbol.CROSS))
			boardState.get(position.getRow()).set(position.getCol(), PositionState.CROSSED);
		else
			boardState.get(position.getRow()).set(position.getCol(), PositionState.CIRCLED);
	}

	public List<List<PositionState>> getBoardState() {
		return boardState;
	}

	public void setBoardState(List<List<PositionState>> boardState) {
		this.boardState = boardState;
	}
}
