package trello;

import java.util.ArrayList;
import java.util.List;

public class BoardList {

	private int id;

	private String name;

	private List<Card> cards;

	public BoardList(String name) {
		this.name = name;
		cards = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

}
