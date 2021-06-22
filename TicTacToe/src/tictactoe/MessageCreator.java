package tictactoe;

public class MessageCreator {

	public Message createMessage(MessageAction messageAction, Game game, PlayerState playerState) {
		Message message = new Message();

		switch (messageAction) {
		case INIT:
			message.setAction("init_game");
			message.setBody("game_id : " + game.getId() + "player_symbol : " + playerState.getTicTacToeSymbol());
			break;
		case REQUEST_MOVE:
			message.setAction("request_game_game");
			message.setBody("game_id : " + game.getId() + "board_state : " + game.getBoard().getBoardState());
			break;
		}

		return message;
	}
}
