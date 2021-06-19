package restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationService {

	private RestaurantManagementService restaurantManagementService;

	private CustomerService customerService;

	public Reservation bookTable(int phoneNumber, int noOfPeople, LocalDateTime startTime, LocalDateTime endTime)
			throws NoTablesFoundException {
		Customer customer = customerService.getCustomerByPhoneNumber(phoneNumber);
		Reservation reservation = new Reservation();
		reservation.setCustomerId(customer.getId());
		reservation.setStartTime(startTime);
		reservation.setEndTime(endTime);

		TableTypeEnum tableType;

		switch (noOfPeople) {
		case 1:
		case 2:
			tableType = TableTypeEnum.SMALL;
		case 3:
		case 4:
			tableType = TableTypeEnum.MEDIUM;
		default:
			tableType = TableTypeEnum.LARGE;
		}

		List<Table> tables = restaurantManagementService.getTablesByType(tableType);
		List<Reservation> reservationsForThisTime = getReservationByTime(startTime, endTime, tableType,
				ReservationStatusEnum.VALID);
		List<Integer> reservedTables = new ArrayList<>();
		for (Reservation reservationForThisTime : reservationsForThisTime)
			reservedTables.add(reservationForThisTime.getTableId());

		for (Table table : tables) {
			if (!reservedTables.contains(table.getId()))
				reservation.setTableId(table.getId());
		}

		if (reservation.getTableId() == null) {
			reservation.setReservationStatusEnum(ReservationStatusEnum.INVALID);
			throw new NoTablesFoundException("No tables for the given time interval");
		}
		reservation.setTableId(tables.get(0).getId());

		reservation.setReservationStatusEnum(ReservationStatusEnum.VALID);
		return reservation;
	}

	public void cancelReservation(int reservationId) {
		Reservation reservation = getReservationById(reservationId);
		reservation.setReservationStatusEnum(ReservationStatusEnum.INVALID);
	}

	public Reservation checkInForReservation(int phoneNumber) {
		Reservation reservation = getReservationByPhoneNumber(phoneNumber);
		if (reservation == null)
			return null;
		LocalDateTime currentTime = LocalDateTime.now();
		if (!currentTime.isBefore(reservation.getStartTime()) && !currentTime.isAfter(reservation.getEndTime())) {
			reservation.setReservationStatusEnum(ReservationStatusEnum.OVER);
			return reservation;
		}
		return null;
	}

	// using 0 for phone number
	public Reservation walkIn(int noOfPeople) throws NoTablesFoundException {
		LocalDateTime currentTime = LocalDateTime.now();
		Reservation reservation = bookTable(0, noOfPeople, currentTime, currentTime.plusHours(2));
		return reservation;
	}

	public Reservation getReservationById(int id) {
		// dao will return the Reservation
		return null;
	}

	public List<Reservation> getReservationByTime(LocalDateTime startTime, LocalDateTime endTime,
			TableTypeEnum tableType, ReservationStatusEnum ReservationStatusEnum) {
//dao will get the list of tables using above filters
		return null;
	}

	public Reservation getReservationByPhoneNumber(int phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}
}
