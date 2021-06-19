package uber;

public class BookingRequest {

	CabType cabType;

	User user;

	Location sourceLocation;

	Location destinationLocation;

	PaymentMethod paymentMethod;

	public Location getSourceLocation() {
		return sourceLocation;
	}

	public CabType getCabType() {
		return cabType;
	}

	public void setCabType(CabType cabType) {
		this.cabType = cabType;
	}

	public Location getDestinationLocation() {
		return destinationLocation;
	}

	public void setDestinationLocation(Location destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public void setSourceLocation(Location sourceLocation) {
		this.sourceLocation = sourceLocation;
	}

}
