package snakeLadder;

public class Ladder {

	private int id;

	private int startPosition;

	private int endPosition;

	public Ladder(int st, int end) {
		this.startPosition = st;
		this.endPosition = end;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStartPosition() {
		return startPosition;
	}

	public void setStartPosition(int startPosition) {
		this.startPosition = startPosition;
	}

	public int getEndPosition() {
		return endPosition;
	}

	public void setEndPosition(int endPosition) {
		this.endPosition = endPosition;
	}

}
