package tictactoe;

public class GameRequestHandlerService {

	GameFacilitator gameFacilitator;
	// use gameRequest object where we also pass info about which piece the user has
	// chosen, maybe the algorithm can use location too to make game faster

	// Don't bring a model object that you fill in later as that is not good
	// practice, maybe someone fetches getSymbol here, use something like
	// gameRequest object and pass player Id
	public void requestPlay(GameRequest gameRequest) {
		try {
			gameFacilitator.addRequestToQueue(gameRequest);
		} catch (Exception e) {
			e.printStackTrace();
			// http 429 - too many requests
			System.out.println("Please try later on! Too many players!");
		}
	}
//this part can be moved to another class where we write the logic of selecting players in the 
	// nearby geographical location and maybe based on what symbol they selected
}
