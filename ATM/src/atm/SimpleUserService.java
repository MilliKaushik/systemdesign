package atm;

public class SimpleUserService extends UserService {

	private static final String taskProcesor = null;

	//private UserTaskFactory userTaskFactory;
	
	private TaskProcessor taskProcessor;
	
	@Override
	public void processTask(Request task) {
		//taskProcessor = userTaskProcessorFactory.createUserTaskProcessor(task.getTaskName());
		taskProcessor.handle();
	}

}
