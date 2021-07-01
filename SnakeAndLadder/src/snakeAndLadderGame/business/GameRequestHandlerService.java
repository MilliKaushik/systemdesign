package snakeAndLadderGame.business;

import snakeAndLadderGame.model.GameRequest;

public class GameRequestHandlerService {

	private GameFacilitator gameFacilitator;

	public GameRequestHandlerService(GameFacilitator gameFacilitator) {
		this.gameFacilitator = gameFacilitator;
	}

	public void requestPlay(GameRequest gameRequest) {
		gameFacilitator.addToList(gameRequest);
	}
}
