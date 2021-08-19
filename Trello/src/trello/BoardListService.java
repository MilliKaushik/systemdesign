package trello;

import java.util.List;

public class BoardListService {

	private BoardService boardService;

	private CardService cardService;

	private BoardListDAO boardListDAO;

	public BoardListService(BoardService boardService, CardService cardService, BoardListDAO boardListDAO) {
		this.boardService = boardService;
		this.cardService = cardService;
		this.boardListDAO = boardListDAO;
	}

	public int createBoardList(int boardId, String name) {
		Board board = boardService.getBoard(boardId);
		BoardList boardList = new BoardList(name);
		int id = IdGenerator.generateId(boardList);
		boardList.setId(id);

		boardListDAO.createOrUpdateBoard(boardList);
		board.getBoardLists().add(boardList);
		return id;
	}

	public void updateBoardList(BoardList list) {
		boardListDAO.createOrUpdateBoard(list);
	}

	public void delete(int id) {
		BoardList list = getBoardList(id);
		for (Card card : list.getCards())
			cardService.delete(card.getId());
		boardListDAO.delete(id);
	}

	public BoardList getBoardList(int id) {
		return boardListDAO.getBoardList(id);
	}

	public List<BoardList> getAllBoardsList() {
		return boardListDAO.getAllBoardLists();
	}

	public void addCard(int boardListId, int cardId) {
		Card card = cardService.getCard(cardId);
		BoardList list = getBoardList(boardListId);
		list.getCards().add(card);
		boardListDAO.createOrUpdateBoard(list);
	}

	public void removeCard(int boardListId, int cardId) {
		Card card = cardService.getCard(cardId);
		BoardList list = getBoardList(boardListId);
		list.getCards().remove(card);
		boardListDAO.createOrUpdateBoard(list);
	}

	public BoardList getListByCard(int cardId) {
		return boardListDAO.getListByCardId(cardId);
	}

}
