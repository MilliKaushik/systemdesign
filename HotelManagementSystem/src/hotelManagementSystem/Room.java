package hotelManagementSystem;

import java.util.List;

public class Room {

	private int id;

	private RoomStatus roomStatus;

	private RoomType roomType;

	private List<RoomKey> roomKeys;

	private List<HousekeepingLog> housekeepingLogs;

	private Double price;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RoomStatus getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(RoomStatus roomStatus) {
		this.roomStatus = roomStatus;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public List<RoomKey> getRoomKeys() {
		return roomKeys;
	}

	public void setRoomKeys(List<RoomKey> roomKeys) {
		this.roomKeys = roomKeys;
	}

	public List<HousekeepingLog> getHousekeepingLogs() {
		return housekeepingLogs;
	}

	public void setHousekeepingLogs(List<HousekeepingLog> housekeepingLogs) {
		this.housekeepingLogs = housekeepingLogs;
	}

}
