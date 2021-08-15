package splitvise.service.validator;

public class InvalidExpenseException extends Exception {

	public InvalidExpenseException(String string) {
		System.out.println(string);
	}

}
