package tictactoe;

import java.util.List;

public class MoveValidityChecker {

	public void isValidMove(Player player, Position posToBeChecked) {
		Board latestBoard = .getLatestBoardState(player.getGame());
		List<List<PositionState>> boardPositions = latestBoard.getBoardState();

		int row = posToBeChecked.getRow();
		int col = posToBeChecked.getCol();

		PositionState posState = boardPositions.get(row).get(col);
		if (!posState.equals(PositionState.UNFILLED))
			//return false;
		if (player.getPlayerSymbol().equals(PlayerSymbol.CROSS) && (!posState.equals(PositionState.CROSSED)))
			//return false;

		if (player.getPlayerSymbol().equals(PlayerSymbol.CIRCLE) && (!posState.equals(PositionState.CIRCLED)))
			//return false;
	}
}
