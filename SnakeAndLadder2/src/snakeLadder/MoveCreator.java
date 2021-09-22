package snakeLadder;

public class MoveCreator {

	public Move createMove(Game game, DiceValue diceValue, int turn) {
		Move move = new Move();

		Player player = game.getPlayers().get(turn);
		move.setDiceValue(diceValue);
		move.setPlayerName(player.getName());
		PlayerPosition playerPosition = game.getBoard().getPlayerPositions().get(player.getName());
		move.setStartPos(playerPosition.getPosition());
		return move;
	}
}
