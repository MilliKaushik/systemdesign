package foodDelivery.business;

import java.util.Date;

public class DeliveryExecutive {

	private int id;

	private String name;

	private int phoneNumber;

	private Location currentLocation;

	private Long timeSincelastDelivery;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}

	public Long getTimeSincelastDelivery() {
		return timeSincelastDelivery;
	}

	public void setTimeSincelastDelivery(Long timeSincelastDelivery) {
		this.timeSincelastDelivery = timeSincelastDelivery;
	}

}
