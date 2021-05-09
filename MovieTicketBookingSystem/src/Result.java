import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Result {

	static int pow2(long N) {
		int ans = 0;
		for (int i = 0; i < 64; i++) {
			long x = 1;
			if ((N & (x << i)) > 0)
				ans++;
		}
		return ans;
	}

	public static int minimumChunksRequired(long totalPackets, List<List<Long>> uploadedChunks) {
		List<List<Long>> list = uploadedChunks;
		// rows
		int n = list.size();
		// cols
		int m = 2;
		// sorting the uploaded chunks
		Collections.sort(list, new Comparator<List<Long>>() {
			public int compare(List<Long> l1, List<Long> l2) {
				return (int) (l1.get(0) - l2.get(0));
			}
		});

		Long lastChunkNum = 1L;
		int ans = 0;
		// calculating length of un-uploaded items
		for (int i = 0; i < list.size(); i++) {
			Long start = list.get(i).get(0);
			Long end = list.get(i).get(m - 1);
			ans += pow2(start - lastChunkNum);
			lastChunkNum = end + 1;
		}

		if (n == 0) {
			ans += pow2(totalPackets);
			return ans;
		}

		if (list.get(n - 1).get(m - 1) != totalPackets) {
			ans += pow2(totalPackets - list.get(n - 1).get(m - 1));
		}
		return ans;
	}
}