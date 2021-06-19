package uber;

public class Cab {

	int id;

	Driver driver;

	String licencePlate;

	Location currentLocation;

	Booking currentBooking;

	CabType cabType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getLicencePlate() {
		return licencePlate;
	}

	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}

	public Booking getCurrentBooking() {
		return currentBooking;
	}

	public void setCurrentBooking(Booking currentBooking) {
		this.currentBooking = currentBooking;
	}

	public CabType getCabType() {
		return cabType;
	}

	public void setCabType(CabType cabType) {
		this.cabType = cabType;
	}
}
