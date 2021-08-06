package atm;

public abstract class UserService {
	
	private LoggingService loggingService;
	
	public abstract void processTask(Request task);

}
