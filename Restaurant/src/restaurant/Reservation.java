package restaurant;

import java.time.LocalDateTime;
import java.util.Date;

public class Reservation {

	private int id;

	private int customerId;

	private LocalDateTime startTime;

	private LocalDateTime endTime;

	private int tableId;

	private ReservationStatusEnum reservationStatusEnum;

	// getters and setters

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public Integer getTableId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setReservationStatusEnum(ReservationStatusEnum reservationStatusEnum) {
		this.reservationStatusEnum = reservationStatusEnum;
	}

	public int getId() {
		return id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public ReservationStatusEnum getReservationStatusEnum() {
		return reservationStatusEnum;
	}

	

}
