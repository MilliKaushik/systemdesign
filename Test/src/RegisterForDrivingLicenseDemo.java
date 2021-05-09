import java.util.Scanner;

class RegisterForDrivingLicenseDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int userAge = Integer.parseInt(scanner.nextLine());
		try {
			if (userAge < 0) {
				throw new InvalidAgeForDrivingLicenseException("Invalid age");
			} else if (userAge < 18) {
				throw new InvalidAgeForDrivingLicenseException("Age should be more than 18 years old");
			}
		} catch (InvalidAgeForDrivingLicenseException iafdlex) {
			System.out.println(iafdlex.getMessage());
		}

		int mark = Integer.parseInt(scanner.nextLine());
		try {
			if (mark < 80) {
				throw new InvalidMarkForDrivingLicenseException("Mark should be more than 80");
			}
			System.out.println("Approved");

		} catch (

		InvalidMarkForDrivingLicenseException imfdlex) {
			System.out.println(imfdlex.getMessage());

		} finally {
			scanner.close();
		}
	}

}
