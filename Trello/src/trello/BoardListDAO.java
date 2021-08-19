package trello;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardListDAO {

	private Map<Integer, BoardList> boardLists;

	public BoardListDAO() {
		boardLists = new HashMap<>();
	}

	public void createOrUpdateBoard(BoardList list) {
		boardLists.put(list.getId(), list);
	}

	public BoardList getBoardList(int id) {
		return boardLists.get(id);
	}

	public List<BoardList> getAllBoardLists() {
		return (List<BoardList>) boardLists.values();
	}

	public void delete(int id) {
		boardLists.remove(id);
	}

	public BoardList getListByCardId(Integer cardId) {
		BoardList boardList = null;
		for (Map.Entry<Integer, BoardList> entry : boardLists.entrySet()) {
			List<Card> cards = entry.getValue().getCards();
			for (Card card : cards)
				if (card.getId().equals(cardId)) {
					boardList = getBoardList(entry.getKey());
				}
		}
		return boardList;
	}

}
