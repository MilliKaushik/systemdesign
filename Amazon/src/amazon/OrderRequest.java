package amazon;

import java.util.Date;
import java.util.List;

public class OrderRequest {

	private int userId;

	private double amount;

	private Date creationDate;

	private List<OrderItemRequest> orderItemRequest;

	private String shippingAddress;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public List<OrderItemRequest> getOrderItemRequest() {
		return orderItemRequest;
	}

	public void setOrderItemRequest(List<OrderItemRequest> orderItemRequest) {
		this.orderItemRequest = orderItemRequest;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

}
