package trello;

import java.util.List;

public class BoardService {

	private MemberService memberService;

	private BoardListService boardListService;

	private BoardDAO boardDAO;

	public BoardService(MemberService memberService, BoardListService boardListService, BoardDAO boardDAO) {
		this.memberService = memberService;
		this.boardListService = boardListService;
		this.boardDAO = boardDAO;
	}

	public int createBoard(String name) {
		Board board = new Board(name);
		int id = IdGenerator.generateId(board);
		board.setId(id);
		String url = URLGenerator.generateURL(id);
		board.setUrl(url);
		boardDAO.createOrUpdateBoard(board);
		return id;
	}

	public void addMember(int boardId, int memberId) {
		Board board = getBoard(boardId);

		Member member = memberService.getMember(memberId);
		board.getMembers().add(member);
	}

	public void removeMember(int boardId, int memberId) {
		Board board = getBoard(boardId);

		Member member = memberService.getMember(memberId);
		List<Member> members = board.getMembers();
		if (members.indexOf(member) >= 0)
			members.remove(member);
	}

	public void updateBoard(Board board) {
		boardDAO.createOrUpdateBoard(board);
	}

	public void delete(int id) {
		Board board = getBoard(id);
		for (BoardList list : board.getBoardLists())
			boardListService.delete(list.getId());
		boardDAO.delete(id);
	}

	public List<Board> getBoards() {
		return boardDAO.getAllBoards();
	}

	public Board getBoard(int boardId) {
		return boardDAO.getBoard(boardId);
	}

}
