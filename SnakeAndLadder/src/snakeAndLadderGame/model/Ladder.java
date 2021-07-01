package snakeAndLadderGame.model;

public class Ladder {

	private Cell stCell;

	private Cell endCell;

	public Ladder(Cell stCell, Cell endCell) {
		this.stCell = stCell;
		this.endCell = endCell;
	}

	public Cell getStCell() {
		return stCell;
	}

	public void setStCell(Cell stCell) {
		this.stCell = stCell;
	}

	public Cell getEndCell() {
		return endCell;
	}

	public void setEndCell(Cell endCell) {
		this.endCell = endCell;
	}
}
