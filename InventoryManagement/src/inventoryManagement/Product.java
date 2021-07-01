package inventoryManagement;

import java.util.Date;

//represents each product of a type of product detail. Example, each blue short of Adidas 
//is represented as one product. This is so as to track each item's status separately
public class Product {

	int id;

	Product product;

	Date timeOfAddition;

	ProductStatus productStatus;

}
