package template;

public class GenerateReport1 {

	private AuditTrail auditTrail;

	public GenerateReport1(AuditTrail auditTrail) {
		this.auditTrail = auditTrail;
	}

	public void execute() {
		auditTrail.record();

		System.out.println("Generating report");
	}
}
