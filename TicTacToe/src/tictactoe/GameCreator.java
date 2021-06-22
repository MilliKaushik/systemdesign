package tictactoe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//player is a static object, every user who has an account is made a player and is assigned some 
//id and some other fields related to him will be stored in the db. This is static.
//In a game, a player is assigned a symbol and in another game, he might use a different symbol. 
//So this is dynamic info that is only stored in memory(game object might be stored in db - now 
//this depends on whether we want a stateless application or a stateful application). If we want a 
//stateless application, we need to keep the state stored in db, and hence have tables like game etc in db.
//If we want a stateful application, the state is in memory.
public class GameCreator {
//no singleton
	PlayerService playerService;

	public Game createGame(GameRequest gameRequest1, GameRequest gameRequest2) {
		List<PlayerState> playerStates = new ArrayList<>();

		List<Player> players = new ArrayList<>();

		players.add(playerService.getPlayer(gameRequest1.getPlayerId()));
		players.add(playerService.getPlayer(gameRequest2.getPlayerId()));

		PlayerState playerState1 = new PlayerState();
		playerState1.setPlayer(players.get(0));
		playerState1.setTicTacToeSymbol(TicTacToeSymbol.CROSS);

		PlayerState playerState2 = new PlayerState();
		playerState2.setPlayer(players.get(1));
		playerState2.setTicTacToeSymbol(TicTacToeSymbol.CIRCLE);

		Game game = new Game(playerStates, new Date(), new Board());
		return game;
	}
}
