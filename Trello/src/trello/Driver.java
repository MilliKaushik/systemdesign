package trello;

import java.util.Scanner;

public class Driver {
	private static final String CREATE = "CREATE";
	private static final String SHOW = "SHOW";
	private static final String BOARD = "BOARD";
	private static final String CARD = "CARD";
	private static final String LIST = "LIST";

	private static final String ADD_MEMBER = "ADD_MEMBER";
	private static final String REMOVE_MEMBER = "REMOVE_MEMBER";

	private static final String NAME = "name";
	private static final String PRIVACY = "privacy";
	private static final String DELETE = "DELETE";

	public static void main(String[] args) {
		BoardDAO boardDAO = new BoardDAO();
		MemberService memberService = new MemberService(new MemberDAO());

		BoardService boardService = null;
		BoardListService boardListService = null;
		BoardListDAO boardListDAO = new BoardListDAO();

		CardDAO cardDAO = new CardDAO();
		CardService cardService = new CardService(boardListService, memberService, cardDAO);
		boardListService = new BoardListService(boardService, cardService, boardListDAO);
		boardService = new BoardService(memberService, boardListService, boardDAO);

		OrchestratorService orchestratorService = new OrchestratorService(boardService, boardListService, cardService,
				memberService);

		System.out.println(memberService.createMember(new Member("u1")));
		System.out.println(memberService.createMember(new Member("u2")));
		System.out.println(memberService.createMember(new Member("u3")));
		System.out.println(memberService.createMember(new Member("u4")));

		Scanner sc = new Scanner(System.in);

		boolean exit = false;
		while (!exit) {
			String[] splitInput = (sc.nextLine()).split("\\s+");
			String command = splitInput[0];
			switch (command) {
			case BOARD:
				if (splitInput[1].equals(CREATE))
					orchestratorService.createBoard(splitInput[2]);
				else if (splitInput[2].equals(NAME) || splitInput[2].equals(PRIVACY))
					orchestratorService.updateBoard(splitInput);
				else if (splitInput[2].equals(ADD_MEMBER))
					orchestratorService.addMemberToBoard(splitInput);
				else if (splitInput[2].equals(REMOVE_MEMBER))
					orchestratorService.removeMemberToBoard(splitInput);
				else if (splitInput[1].equals(DELETE))
					orchestratorService.deleteBoard(splitInput[2]);
				break;
			case LIST:
				if (splitInput[1].equals(CREATE))
					orchestratorService.createList(splitInput);
				else if (splitInput[2].equals(NAME) || splitInput[2].equals(PRIVACY))
					orchestratorService.updateList(splitInput);
				else if (splitInput[1].equals(DELETE))
					orchestratorService.deleteList(splitInput[2]);
				break;
			case SHOW:
				if (splitInput.length == 1)
					orchestratorService.showAllBoards();
				else if (splitInput[1].equals(BOARD))
					orchestratorService.showBoardById(splitInput[2]);
				break;
			default:
				exit = true;
			}
		}
		sc.close();
	}
}
