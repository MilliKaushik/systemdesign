
public class Test1 {

	public int totalTurns(String str, int m, int n) {
		int count = 0;
		int len = str.length();
		String curr = str;
		boolean turn = true;
		do {
			count++;
			String res = null;
			if (turn)
				res = getStr(curr, len, m);
			else
				res = getStr(curr, len, n);
			curr = res;
			turn = !turn;
		} while (!curr.equals(str));

		return count;

	}

	private String getStr(String str, int len, int a) {
		return str.substring(len - a, len) + str.substring(0, len - a);
	}

}
