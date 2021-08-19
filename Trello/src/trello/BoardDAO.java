package trello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardDAO {

	private Map<Integer, Board> boards;

	public BoardDAO() {
		boards = new HashMap<>();
	}

	public void createOrUpdateBoard(Board board) {
		boards.put(board.getId(), board);
	}

	public Board getBoard(int id) {
		return boards.get(id);
	}

	public List<Board> getAllBoards() {
		return new ArrayList<>(boards.values());
	}

	public void delete(int id) {
		boards.remove(id);
	}
}
