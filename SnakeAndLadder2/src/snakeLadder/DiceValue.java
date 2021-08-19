package snakeLadder;

public enum DiceValue {
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);

	private int val;

	private DiceValue(int val) {
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}

}
