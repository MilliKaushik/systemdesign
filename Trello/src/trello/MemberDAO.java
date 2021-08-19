package trello;

import java.util.HashMap;
import java.util.Map;

public class MemberDAO {

	private Map<Integer, Member> members;

	public MemberDAO() {
		members = new HashMap<>();
	}

	public Member getMember(int id) {
		return members.get(id);
	}

	public void createMember(Member member) {
		members.put(member.getId(), member);
	}

	public Member getMemberByEmail(String email) {
		for (Map.Entry<Integer, Member> entry : members.entrySet()) {
			if (entry.getValue().getEmail().equals(email))
				return entry.getValue();
		}
		return null;
	}

}
