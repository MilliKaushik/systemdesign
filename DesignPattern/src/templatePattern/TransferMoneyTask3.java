package templatePattern;

public class TransferMoneyTask3 extends Task3 {

	public TransferMoneyTask3(AuditTrail auditTrail) {
		super(auditTrail);
	}

	@Override
	public void doExecute() {
		System.out.println("Transferring money");
	}
}
