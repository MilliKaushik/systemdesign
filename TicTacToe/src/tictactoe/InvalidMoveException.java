package tictactoe;

public class InvalidMoveException extends PlayerMoveException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMoveException(String string) {
		super(string);
	}

}
