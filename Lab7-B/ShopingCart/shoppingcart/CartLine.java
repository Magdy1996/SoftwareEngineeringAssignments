package shoppingcart;
import products.Product;

public class CartLine {
	int quantity;
	Product product;

	public Product getProduct() {
		return product;
	}

	public void setPoduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
