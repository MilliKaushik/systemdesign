package foodDelivery.business;

import java.util.List;

public class DEAssignmentManager {

	private DeliveryExecutiveFinder deliveryExecutiveFinder;

	private IDeliveryExecutiveSelector ideliveryExecutiveSelector;

	public void assignDeliveryExecutive(Order order) {
		List<DEForAnOrderDto> nearByDEs = deliveryExecutiveFinder.findNearbyDeliveryExecutive(order);
		
		DeliveryExecutive deliveryExecutive = ideliveryExecutiveSelector.selectDeliveryExecutive(nearByDEs);
		order.setDeliveryExecutive(deliveryExecutive);
	}
}
