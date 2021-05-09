
public class InvalidAgeForDrivingLicenseException extends Exception {
	String expDescription;

	InvalidAgeForDrivingLicenseException(String expDescription) {
		super(expDescription);
	}
}
