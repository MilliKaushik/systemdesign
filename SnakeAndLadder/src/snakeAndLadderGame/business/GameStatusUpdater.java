package snakeAndLadderGame.business;

import snakeAndLadderGame.model.Board;
import snakeAndLadderGame.model.PlayerState;

//using strategy pattern as we might need to use a board of size 100 tomorrow
public interface GameStatusUpdater {

	void updateGameStatus(Board board, PlayerState playerState, int diceVal);

}
