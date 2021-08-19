package trello;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private int id;

	private String name;

	private List<BoardList> boardLists;

	private List<Member> members;

	private String url;

	private Privacy privacy;

	public Board(String name) {
		this.name = name;
		this.privacy = Privacy.PRIVATE;
		boardLists = new ArrayList<>();
		members = new ArrayList<>();
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

	public List<BoardList> getBoardLists() {
		return boardLists;
	}

	public void setBoardLists(List<BoardList> boardLists) {
		this.boardLists = boardLists;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Privacy getPrivacy() {
		return privacy;
	}

	public void setPrivacy(Privacy privacy) {
		this.privacy = privacy;
	}

}
