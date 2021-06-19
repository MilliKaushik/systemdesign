
public class Elevator {

	private int noOfFloors;
	private boolean senseOpenTrigger;
	private boolean isMovingUp;
	private int currentFloor;
	private ElevatorFloorRequestState elevatorFloorRequestState;

	public Elevator(int noOfFloors, boolean senseOpenTrigger, boolean isMovingUp, int currentFloor) {
		this.noOfFloors = noOfFloors;
		this.senseOpenTrigger = senseOpenTrigger;
		this.isMovingUp = isMovingUp;
		this.currentFloor = currentFloor;
		elevatorFloorRequestState = new ElevatorFloorRequestState(noOfFloors);
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public boolean isSenseOpenTrigger() {
		return senseOpenTrigger;
	}

	public void setSenseOpenTrigger(boolean senseOpenTrigger) {
		this.senseOpenTrigger = senseOpenTrigger;
	}

	public boolean isMovingUp() {
		return isMovingUp;
	}

	public void setMovingUp(boolean isMovingUp) {
		this.isMovingUp = isMovingUp;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
}
