package amazon;

public class Rating {

	private int id;

	private int userId;

	private int orderId;

	private RatingValue ratingValue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public RatingValue getRatingValue() {
		return ratingValue;
	}

	public void setRatingValue(RatingValue ratingValue) {
		this.ratingValue = ratingValue;
	}

}
