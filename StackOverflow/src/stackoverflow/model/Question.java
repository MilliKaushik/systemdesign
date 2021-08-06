package stackoverflow.model;

public class Question extends Post {

	int bounty;

	boolean isOpen;

	public int getBounty() {
		return bounty;
	}

	public void setBounty(int bounty) {
		this.bounty = bounty;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

}
