package tictactoe;

public class PlayerMoveTimeoutException extends PlayerMoveException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PlayerMoveTimeoutException(String string) {
		super(string);
	}

}
