package foodDelivery;

import java.util.Date;

public class DeliveryExecutive {

	private int id;

	private Location currentLocation;

	private Date lastDeliveryTime;

	public DeliveryExecutive(int id, Location currentLocation, Date lastDeliveryTime) {
		this.id = id;
		this.currentLocation = currentLocation;
		this.lastDeliveryTime = lastDeliveryTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}

	public Date getLastDeliveryTime() {
		return lastDeliveryTime;
	}

	public void setLastDeliveryTime(Date lastDeliveryTime) {
		this.lastDeliveryTime = lastDeliveryTime;
	}

}
