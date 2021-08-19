package trello;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardDAO {

	private Map<Integer, Card> cards;

	public CardDAO() {
		cards = new HashMap<>();
	}

	public void createOrUpdateCard(Card card) {
		cards.put(card.getId(), card);
	}

	public Card getCard(int id) {
		return cards.get(id);
	}

	public List<Card> getAllCards() {
		return (List<Card>) cards.values();
	}

	public void delete(int id) {
		cards.remove(id);
	}

}
