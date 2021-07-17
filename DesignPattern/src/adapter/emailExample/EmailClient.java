package adapter.emailExample;

//like outlook
public class EmailClient {

	private EmailProvider emailProvider;

	public EmailClient(EmailProvider emailProvider) {
		this.emailProvider = emailProvider;
	}

	public void sendMail(Mail mail) {
		// format(mail);
		// check for confidential info(mail);
		emailProvider.sendMail(mail);
	}

}
