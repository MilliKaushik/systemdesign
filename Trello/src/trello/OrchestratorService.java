package trello;

import java.util.List;

public class OrchestratorService {

	private static final String NAME = "name";
	private static final String PRIVACY = "privacy";

	private BoardService boardService;

	private BoardListService boardListService;

	private CardService cardService;

	private MemberService memberService;

	public OrchestratorService(BoardService boardService, BoardListService boardListService, CardService cardService,
			MemberService memberService) {
		this.boardService = boardService;
		this.boardListService = boardListService;
		this.cardService = cardService;
		this.memberService = memberService;
	}

	public void showAllBoards() {
		List<Board> boards = boardService.getBoards();
		if (boards.isEmpty())
			System.out.println("No boards");
		for (Board board : boards) {
			System.out
					.println("id :" + board.getId() + " name :" + board.getName() + " privacy :" + board.getPrivacy());
			for (Member member : board.getMembers()) {
				System.out.println(
						"id :" + member.getId() + " name :" + member.getName() + " email:" + member.getEmail());
			}
		}
	}

	public void showBoardById(String input) {
		Board board = boardService.getBoard(Integer.parseInt(input));
		if (board == null)
			System.out.println("Board " + input + " does not exist");
		else
			System.out
					.println("id :" + board.getId() + " name :" + board.getName() + " privacy :" + board.getPrivacy());
	}

	public void createBoard(String input) {
		int id = boardService.createBoard(input);
		System.out.println("Created board:" + id);
	}

	public void updateBoard(String[] input) {
		int id = Integer.parseInt(input[1]);
		Board board = boardService.getBoard(id);
		for (int i = 2; i < input.length; i += 2) {
			if (input[i].equals(NAME))
				board.setName(input[i + 1]);
			if (input[i].equals(PRIVACY)) {
				String privacy = input[i + 1];
				if (privacy.equals(Privacy.PRIVATE.name()))
					board.setPrivacy(Privacy.PRIVATE);
				else
					board.setPrivacy(Privacy.PUBLIC);
			}
		}

		boardService.updateBoard(board);
	}

	public void addMemberToBoard(String[] input) {
		boardService.addMember(Integer.parseInt(input[1]), Integer.parseInt(input[3]));
	}

	public void removeMemberToBoard(String[] input) {
		boardService.removeMember(Integer.parseInt(input[1]), Integer.parseInt(input[3]));
	}

	public void deleteBoard(String input) {
		Board board = boardService.getBoard(Integer.parseInt(input));
		if (board == null)
			System.out.println("Board " + input + " does not exist");
		else
			boardService.delete(Integer.parseInt(input));
	}

	public void createList(String[] input) {
		int boardId = Integer.parseInt(input[2]);
		StringBuilder str = new StringBuilder();
		for (int i = 3; i < input.length; i++)
			str.append(input[i]);
		int id = boardListService.createBoardList(boardId, str.toString());
		System.out.println("Created list :" + id);
	}

	public void showListById(String input) {
		BoardList list = boardListService.getBoardList(Integer.parseInt(input));
		if (list == null)
			System.out.println("List " + input + " does not exist");
		System.out.println("id :" + list.getId() + " name :" + list.getName());
		List<Card> cards = list.getCards();
		if (!cards.isEmpty()) {
			System.out.print("cards : ");
			for (Card card : cards)
				System.out.println("id : " + card.getId() + " name :" + memberService.getMember(card.getMemberId()));
		}
	}

	public void updateList(String[] input) {
		int id = Integer.parseInt(input[1]);
		BoardList list = boardListService.getBoardList(id);
		for (int i = 2; i < input.length; i += 2) {
			if (input[i].equals(NAME))
				list.setName(input[i + 1]);
		}
		boardListService.updateBoardList(list);
	}

	public void deleteList(String input) {
		BoardList list = boardListService.getBoardList(Integer.parseInt(input));
		if (list == null)
			System.out.println("List " + input + " does not exist");
		else
			boardListService.delete(Integer.parseInt(input));
	}

}
