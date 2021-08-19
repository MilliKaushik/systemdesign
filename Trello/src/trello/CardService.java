package trello;

import java.util.List;

public class CardService {

	private BoardListService boardListService;

	private MemberService memberService;

	private CardDAO cardDAO;

	public CardService(BoardListService boardListService, MemberService memberService, CardDAO cardDAO) {
		this.boardListService = boardListService;
		this.memberService = memberService;
		this.cardDAO = cardDAO;
	}

	public int createCard(int boardListId, String email) {
		Member member = memberService.getMemberByEmail(email);
		Card card = new Card();
		card.setMemberId(member.getId());

		int id = IdGenerator.generateId(card);
		card.setId(id);

		cardDAO.createOrUpdateCard(card);
		boardListService.addCard(boardListId, card.getId());
		return id;
	}

	public void moveCard(int cardId, int destListId) {
		BoardList currentListForCard = boardListService.getListByCard(cardId);
		boardListService.removeCard(currentListForCard.getId(), cardId);
		boardListService.addCard(destListId, cardId);
	}

	public void assignMember(int cardId, int memberId) {
		Card card = getCard(cardId);
		card.setMemberId(memberId);
		cardDAO.createOrUpdateCard(card);
	}

	public void unassignMember(int cardId, int memberId) {
		Card card = getCard(cardId);
		card.setMemberId(null);
		cardDAO.createOrUpdateCard(card);
	}

	public void updateCard(Card card) {
		cardDAO.createOrUpdateCard(card);
	}

	public void delete(int cardId) {
		cardDAO.delete(cardId);
	}

	public List<Card> getCards() {
		return cardDAO.getAllCards();
	}

	public Card getCard(int cardId) {
		return cardDAO.getCard(cardId);
	}

}
