package inventoryManagement;

import java.util.List;

public class InventoryManagementService {

	Validator validator;

	// creates a new product
	public void addProductInfo(ProductInfo productInfo) {
		/**
		 * This is the metadata for a product. example, describes a shirt.
		 * 
		 * insert into product_detail(name, desc, price, supplier_id);
		 */
	}

	// add quantities of it
	public void addProduct(Product product) {
		/**
		 * This refers to each and every product item - example if inventory has 10 blue
		 * shirts of Adidas, each is modelled in DB as separate product.
		 * 
		 * insert into product(product_id, status, time_of_addition);
		 */
	}

	// update product detail like price, supplier, desc etc
	public void updateProductInfo(ProductInfo productInfo) {

	}

	// update product like status of product
	public void updateProduct(Product product) {

	}

	// delete the product, example delete all items of blue Adidas shirt and its
	// metadata from inventory DB
	public void deleteProductInfo(ProductInfo productInfo) {

	}

	// can we have a method like deleteProductForProductInfo which means delete the
	// first or oldest product which has the given product info
	public void deleteProductForProductInfo(ProductInfo productInfo) {
		// dao call
		validator.validateProductForProductInfo(productInfo);
	}

	// delete one item of the product from the inventory, example one blue shirt of
	// Adidas
	public void deleteProduct(Product product) {
//dao call
		validator.validate(product);

	}

	public ProductInfo getProductInfo(int productInfoId) {
		return null;
	}

	public Product getProduct(int productId) {
		return null;
	}

	public List<ProductDTO> getProductQuantity(ProductInfo productInfo) {
		/**
		 * select pd.name, COUNT(p.product_id) AS quantity from product p join
		 * product_detail pd on (p.product_id = pd.id) group by pd.name
		 */
		return null;
	}

}
