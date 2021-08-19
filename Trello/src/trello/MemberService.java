package trello;

public class MemberService {

	private MemberDAO memberDAO;

	public MemberService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	public Member getMember(int id) {
		return memberDAO.getMember(id);
	}

	public int createMember(Member member) {
		int id = IdGenerator.generateId(member);
		member.setId(id);
		memberDAO.createMember(member);
		return id;
	}

	public Member getMemberByEmail(String email) {
		return memberDAO.getMemberByEmail(email);
	}

}
