package amazon;

public class ShoppingCartItemRequest {

	private int ShoppingCartId;

	private CartItem cartItem;

	public int getShoppingCartId() {
		return ShoppingCartId;
	}

	public void setShoppingCartId(int shoppingCartId) {
		ShoppingCartId = shoppingCartId;
	}

	public CartItem getCartItem() {
		return cartItem;
	}

	public void setCartItem(CartItem cartItem) {
		this.cartItem = cartItem;
	}

}
