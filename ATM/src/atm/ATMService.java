package atm;

public class ATMService {

	private AuthenticationService authService;

	private FetchUserTaskService fetchUserTaskService;

	private UserService userService;

	private UserServiceFactory userServiceFactory;

	private AuthServiceFactory authServiceFactory;

	public void insertCard(Card card) {

		authService.authenticate(card);
//		try {
//			// Factory?
//			// static method or separate class?
//			
//		} catch (UserNotAuthenticatedException e) {
//			System.out.println("User not authenticated");
//			// How to log?
//			// Is this correct?
//		}

		Request request = fetchUserTaskService.fetchUserRequest(card.getCardType());

		userService = userServiceFactory.createUserService(card.getCardType());

		userService.processTask(request);
	}

}
