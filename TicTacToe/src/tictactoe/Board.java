package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private static final int BOARD_SIZE = 3;
	
	BoardStatus boardStatus;

	List<List<TicTacToeSymbol>> boardState;

	public Board() {
		boardState = new ArrayList<>();
		for (int i = 0; i < BOARD_SIZE; i++)
			for (int j = 0; j < BOARD_SIZE; j++)
				boardState.get(i).set(j, TicTacToeSymbol.UNFILLED);
	}

	public Board(Move position, TicTacToeSymbol ticTacToeSymbol) {
		boardState.get(position.getRow()).set(position.getCol(), TicTacToeSymbol.CROSS);
	}

	public List<List<TicTacToeSymbol>> getBoardState() {
		return boardState;
	}

	public void setBoardState(List<List<TicTacToeSymbol>> boardState) {
		this.boardState = boardState;
	}
}
