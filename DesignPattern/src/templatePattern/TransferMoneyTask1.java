package templatePattern;

public class TransferMoneyTask1 extends Task3 {

	public TransferMoneyTask1(AuditTrail auditTrail) {
		super(auditTrail);
	}

	public void doExecute() {
		System.out.println("Transferring money");
	}
}
