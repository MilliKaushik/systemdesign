package restaurant;

import java.util.ArrayList;
import java.util.List;

public class FoodItemInventoryManagementService {

	public void addItems(List<Item> items) {

	}

	public void removeItems(List<Item> items) {

	}

	public void updateItems(List<Item> items) {

	}

	public List<Item> displayItems() {
		return new ArrayList<>();
	}

	public boolean areItemsAvailable(List<Item> items) {
		for (Item item : items) {
			// dao will get the number of items from database, if it is less, then return
			// false
		}
		return false;
	}
}
