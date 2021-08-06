import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println(countAnalogousArrays(Arrays.asList(-2, -1, -2, 5), 3, 10));
	}

	public static int countAnalogousArrays(List<Integer> consecutiveDifference, int lowerBound, int upperBound) {
		int count = 0;
		int min = lowerBound, max = lowerBound;
		int prev = lowerBound, curr = 0;
		for (int i = 1; i <= consecutiveDifference.size(); i++) {
			curr = prev - consecutiveDifference.get(i - 1);
			min = Math.min(min, curr);
			max = Math.max(max, curr);
			prev = curr;
		}

		while (max <= upperBound) {
			if (min >= lowerBound && max <= upperBound)
				count++;
			min = min + 1;
			max = max + 1;
		}
		return count;
	}

}
