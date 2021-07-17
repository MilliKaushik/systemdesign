package adapter.emailExample;

public class GmailAdapter implements EmailProvider {

	private Gmail gmail;

	public GmailAdapter(Gmail gmail) {
		this.gmail = gmail;
	}

	@Override
	public void sendMail(Mail mail) {
		gmail.connectToGmail();
		gmail.mail(mail);
	}

}
