package foodDelivery.business;

import java.util.List;

public class DeliveryExecutiveService {

	private List<DeliveryExecutive> deliveryExecutives;

	public void addDeliveryExecutive(DeliveryExecutive deliveryExecutive) {
		deliveryExecutives.add(deliveryExecutive);
	}
}
