package snakeLadder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int noOfSnakes = sc.nextInt();

		List<Snake> snakes = new ArrayList<>();
		while (noOfSnakes-- != 0) {
			int st = sc.nextInt();
			int end = sc.nextInt();
			snakes.add(new Snake(st, end));
		}

		int noOfLadders = sc.nextInt();

		List<Ladder> ladders = new ArrayList<>();
		while (noOfLadders-- != 0) {
			int st = sc.nextInt();
			int end = sc.nextInt();
			ladders.add(new Ladder(st, end));
		}

		int noOfPlayers = sc.nextInt();
		List<Player> players = new ArrayList<>();
		while (noOfPlayers-- != 0) {
			String playerName = sc.next();
			players.add(new Player(playerName));
		}

		MoveCreator moveCreator = new MoveCreator();
		GameDAO gameDAO = new GameDAO();
		DiceRoller diceRoller = new DiceRoller();
		MoveExecutor moveExecutor = new MoveExecutor();
		GameService gameService = new GameService(gameDAO, diceRoller, moveExecutor, moveCreator);

		GameRequest gameRequest = new GameRequest();
		gameRequest.setLadders(ladders);
		gameRequest.setSnakes(snakes);
		gameRequest.setPlayers(players);
		Game game = gameService.createGame(gameRequest);

		gameService.playGame(game);

		sc.close();
	}
}
