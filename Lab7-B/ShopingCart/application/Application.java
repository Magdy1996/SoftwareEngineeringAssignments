package application;
import products.Product;
import shoppingcart.ShoppingCart;


public class Application {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Product product1 = new Product("A123", 100.0, "TV");
		cart.action(product1,"add");
		Product product2 = new Product("A665", 75.0, "MP3 Player");
		cart.action(product2,"add");
		Product product3 = new Product("A665", 75.0, "MP3 Player");
		cart.action(product3,"add");
		
		cart.action(null,"print");
		
		cart.action(product3,"remove");
		cart.action(product2,"remove");
		
		cart.action(null,"print");

	}

}
