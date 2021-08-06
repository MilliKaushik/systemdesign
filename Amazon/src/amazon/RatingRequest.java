package amazon;

public class RatingRequest {

	private int userId;

	private RatingValue ratingValue;

	private int orderId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public RatingValue getRatingValue() {
		return ratingValue;
	}

	public void setRatingValue(RatingValue ratingValue) {
		this.ratingValue = ratingValue;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

}
