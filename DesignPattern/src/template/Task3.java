package template;

public abstract class Task3 {
	private AuditTrail auditTrail;

	public Task3(AuditTrail auditTrail) {
		this.auditTrail = auditTrail;
	}

	public void execute() {
		auditTrail.record();
		doExecute();
	}
	
	protected abstract void doExecute();
}