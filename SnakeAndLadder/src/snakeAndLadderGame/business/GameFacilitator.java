package snakeAndLadderGame.business;

import snakeAndLadderGame.model.GameRequest;

public interface GameFacilitator {

	void addToList(GameRequest gameRequest);

	void facilitateGame();

}
