package foodDelivery.business;

import java.util.Comparator;

public class DEForAnOrderComparator implements Comparator<DEForAnOrderDto> {

	// considering time to deliver as the first priority and time since last
	// delivery of an executive as the second priority
	@Override
	public int compare(DEForAnOrderDto de1, DEForAnOrderDto de2) {
		int timeToDeliverDiff = Long.compare(de1.getTimetoDeliverOrder(), de2.getTimetoDeliverOrder());
		if (timeToDeliverDiff == 0)
			return Long.compare(de1.getDeliveryExecutive().getTimeSincelastDelivery(),
					de2.getDeliveryExecutive().getTimeSincelastDelivery());
		return timeToDeliverDiff;
	}
}
