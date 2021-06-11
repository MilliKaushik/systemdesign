package templatePattern;

public class GenerateReport3 extends Task3 {

	public GenerateReport3(AuditTrail auditTrail) {
		super(auditTrail);
	}

	@Override
	public void doExecute() {
		System.out.println("Generating report");
	}
}
