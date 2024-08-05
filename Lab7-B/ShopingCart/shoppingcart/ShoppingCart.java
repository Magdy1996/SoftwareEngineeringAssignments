package shoppingcart;
import java.util.ArrayList;


import java.util.Iterator;

import products.Product;

public class ShoppingCart {
	ArrayList<CartLine> shopingCartItems = new ArrayList<CartLine>();

	public void action(Product product, String action) {
		if (action.equals("add")){
		for (CartLine cartLine : shopingCartItems) {
			if (cartLine.getProduct().getProductNumber().equals(product.getProductNumber())) {
				cartLine.setQuantity(cartLine.getQuantity()+1);
				return;
			}
		}
		CartLine cartLine = new CartLine();
		cartLine.setPoduct(product);
		cartLine.setQuantity(1);
		shopingCartItems.add(cartLine);
		}
		else{
			if (action.equals("remove")){
			Iterator<CartLine> shopingCartItemsIterator = shopingCartItems.iterator();
			while (shopingCartItemsIterator.hasNext()){
				CartLine cartLine = shopingCartItemsIterator.next();
				if (cartLine.getProduct().getProductNumber().equals(product.getProductNumber())){
					if (cartLine.getQuantity()>1){
						cartLine.setQuantity(cartLine.getQuantity()-1);
					}
					else{
						shopingCartItemsIterator.remove();
					}
				}
			}
			}
			else{ //action is print
				System.out.println("Content of the shoppingcart:");
				for (CartLine cartLine : shopingCartItems) {
					System.out.println(cartLine.getQuantity() + " "
							+ cartLine.getProduct().getProductNumber() + " "
							+ cartLine.getProduct().getProductDescription() + " "
							+ cartLine.getProduct().getProdcutPrice());
				}
				System.out.println("Total price ="+ getTotalPrice());
			}
		}
	}

	
	// get total price
	public double getTotalPrice(){
		double totalPrice = 0.0;
		for (CartLine cartLine : shopingCartItems) {
			totalPrice=totalPrice+(cartLine.getProduct().getProdcutPrice() * cartLine.getQuantity());
		}
		return totalPrice;
	}
}
