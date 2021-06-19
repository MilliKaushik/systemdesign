package restaurant;

public class PaymentService {

	private OrderService orderService;

	public boolean makePayment(int orderId, PaymentStrategy paymentStrategy) {
		Order order = orderService.getOrder(orderId);
		if (paymentStrategy.pay()) {
			order.setOrderStatus(OrderStatusEnum.PAID);
			return true;
		} else {
			order.setOrderStatus(OrderStatusEnum.CANCELLED);
			return false;
		}
	}

	public void refund() {
	}
}
