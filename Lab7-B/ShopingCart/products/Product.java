package products;
public class Product {
	String productNumber;
	double prodcutPrice;
	String productDescription;

	public Product(String productNumber, double productPrice, String productDescription) {
		super();
		this.productNumber = productNumber;
		this.prodcutPrice = productPrice;
		this.productDescription = productDescription;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public double getProdcutPrice() {
		return prodcutPrice;
	}

	public void setProdcutPrice(double prodcutPrice) {
		this.prodcutPrice = prodcutPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}
