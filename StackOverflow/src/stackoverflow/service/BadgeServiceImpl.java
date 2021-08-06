package stackoverflow.service;

import stackoverflow.enumeration.Badge;
import stackoverflow.model.User;

public class BadgeServiceImpl implements BadgeService {

	private static final int GOLD_BASE = 150;
	private static final int SILVER_BASE = 100;
	private static final int BRONZE_BASE = 50;

	private int goldBase;
	private int silverBase;
	private int bronzeBase;

	public BadgeServiceImpl() {
		goldBase = GOLD_BASE;
		silverBase = SILVER_BASE;
		bronzeBase = BRONZE_BASE;
	}

	public BadgeServiceImpl(int goldBase, int silverBase, int bronzeBase) {
		this.goldBase = goldBase;
		this.silverBase = silverBase;
		this.bronzeBase = bronzeBase;
	}

	// point >= 150 gold
	// point >= 100 silver
	// point >= 50 bronze
	@Override
	public void handleBadgeAssignment(User user) {
		int points = user.getPoints();
		if (points >= getGoldBase())
			user.setBadge(Badge.GOLD);
		else if (points >= getSilverBase())
			user.setBadge(Badge.SILVER);
		else if (points >= getBronzeBase())
			user.setBadge(Badge.BRONZE);
		else
			user.setBadge(Badge.NONE);
	}

	public int getGoldBase() {
		return goldBase;
	}

	public void setGoldBase(int goldBase) {
		this.goldBase = goldBase;
	}

	public int getSilverBase() {
		return silverBase;
	}

	public void setSilverBase(int silverBase) {
		this.silverBase = silverBase;
	}

	public int getBronzeBase() {
		return bronzeBase;
	}

	public void setBronzeBase(int bronzeBase) {
		this.bronzeBase = bronzeBase;
	}

}
