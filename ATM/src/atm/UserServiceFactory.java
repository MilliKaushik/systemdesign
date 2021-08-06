package atm;

public class UserServiceFactory {

	public UserService createUserService(CardType cardType) {
		UserService userService = null;
		switch (cardType) {
		case SIMPLE_USER:
			userService = new SimpleUserService();
		case OPERATOR:
			userService = new OperatorService();
		case BANK_MANAGER:
			userService = new BankManagerService();
		}
		return userService;
	}

}
