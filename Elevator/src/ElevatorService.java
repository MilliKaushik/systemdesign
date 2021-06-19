import java.util.Arrays;
import java.util.Queue;

public class ElevatorService  {

	private boolean[] elevatorFloorRequest;
	private boolean isSenseOpen;
	private Queue<Integer> queue;
	private boolean isMovingUp;
	private int currFloor;

	public ElevatorService(int n) {
		this.elevatorFloorRequest = new boolean[n];
		Arrays.fill(elevatorFloorRequest, false);
		isSenseOpen = false;
		currFloor = 0;
	}

}
