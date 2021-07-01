package snakeAndLadderGame.model;

public class Snake {

	Cell stCell;

	Cell endCell;

	public Snake(Cell stCell, Cell endCell) {
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
