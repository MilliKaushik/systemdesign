package foodDelivery.business;

import java.util.List;
import java.util.PriorityQueue;

public class DeliveryExecutiveSelector implements IDeliveryExecutiveSelector {

	@Override
	public DeliveryExecutive selectDeliveryExecutive(List<DEForAnOrderDto> nearByDEs) {
		PriorityQueue<DEForAnOrderDto> queue = new PriorityQueue<>(new DEForAnOrderComparator());
		return queue.remove().getDeliveryExecutive();
	}
}