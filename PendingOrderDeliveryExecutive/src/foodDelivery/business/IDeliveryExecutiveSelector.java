package foodDelivery.business;

import java.util.List;

public interface IDeliveryExecutiveSelector {

	DeliveryExecutive selectDeliveryExecutive(List<DEForAnOrderDto> nearByDEs);

}
