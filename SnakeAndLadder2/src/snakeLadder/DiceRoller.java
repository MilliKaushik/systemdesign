package snakeLadder;

import java.util.Random;

public class DiceRoller {

	private static final int MAX_DICE_VAL = 6;

	private Random random;

	public DiceRoller() {
		random = new Random();
	}

	public DiceValue rollDice() {
		// so that the range is between 1 and 6
		int diceVal = 1 + random.nextInt(MAX_DICE_VAL);
		switch (diceVal) {
		case 1:
			return DiceValue.ONE;
		case 2:
			return DiceValue.TWO;
		case 3:
			return DiceValue.THREE;
		case 4:
			return DiceValue.FOUR;
		case 5:
			return DiceValue.FIVE;
		case 6:
			return DiceValue.SIX;
		}
		return DiceValue.ONE;
	}

}
