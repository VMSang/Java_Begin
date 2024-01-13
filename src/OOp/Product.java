package OOp;

public class Product {
	private String name;
	private double price;
	private double tax;

	// contructor
	public Product() {

	}

	// Encapsulation
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	// function
	public Product nhapThongTin(String name1, double price1, double tax1) {
		Product pr = new Product();
		pr.setName(name1);
		pr.setPrice(price1);
		pr.setTax(tax1);
		return pr;
	}

	public void xuatThongTin(Product pr) {
		System.out.println("ten là: " + pr.getName() + " giá: " + pr.getPrice() + " thuế: " + pr.getTax());
	}

	public double getTaxPrice(Product pr) {
		return pr.getPrice() * pr.getTax();
	}

}
