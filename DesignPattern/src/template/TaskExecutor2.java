package template;

//solving the problem using polymorphism - strategy pattern
public abstract class TaskExecutor2 {
	private AuditTrail auditTrail;

	public TaskExecutor2(AuditTrail auditTrail) {
		this.auditTrail = auditTrail;
	}

	public void execute(Task2 task) {
		auditTrail.record();
		task.execute();
	}
}
