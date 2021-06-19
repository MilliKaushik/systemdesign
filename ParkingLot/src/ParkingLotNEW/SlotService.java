package ParkingLotNEW;
import java.util.Stack;

public class SlotService {
	Stack<Slot> smallSlot;
	Stack<Slot> mediumSlot;
	Stack<Slot> largeSlot;
	Stack<Slot> xLargeSlot;

	public SlotService() {
		smallSlot = new Stack<>();
		mediumSlot = new Stack<>();
		largeSlot = new Stack<>();
		xLargeSlot = new Stack<>();
	}

	public synchronized Slot bookSlot(Vehicle vehicle) {
		Slot slot = null;
		switch (vehicle.getVehicleType()) {
		case MOTORCYCLE:
			if (!smallSlot.isEmpty()) {
				slot = smallSlot.pop();
				break;
			}
		case CAR:
			if (!mediumSlot.isEmpty()) {
				slot = mediumSlot.pop();
				break;
			}
		case TRUCK:
			if (!largeSlot.isEmpty()) {
				slot = largeSlot.pop();
				break;
			}
		case BUS:
			if (!xLargeSlot.isEmpty()) {
				slot = xLargeSlot.pop();
				break;
			}
		}
		return slot;
	}

	public void removeSlot(int slotId) {
		Slot slot = getSlot(slotId);
		switch (slot.getSlotType()) {
		case SMALL:
			smallSlot.push(slot);
			break;
		case MEDIUM:
			mediumSlot.push(slot);
			break;
		case LARGE:
			largeSlot.push(slot);
			break;
		case XLARGE:
			xLargeSlot.push(slot);
			break;
		}
	}

	public Slot getSlot(int slotId) {
		return null;
	}
}
