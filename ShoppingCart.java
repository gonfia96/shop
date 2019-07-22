package shop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> products = new ArrayList<Product>();
	private UnpaidBill b = new UnpaidBill(this);

	public ShoppingCart() {
		super();
	}

	public void add(Product p) {
		products.add(p);
		b.notifyAllObservers();
	}

	public void remove(Product p) {
		products.remove(p);
		b.notifyAllObservers();
	}

	public boolean isEmpty() {
		return products.isEmpty();
	}

	public int getNumProducts() {
		return products.size();
	}

	public double getPrice() {
		double totalPrice = 0.0;
		for (Product s : products) {
			totalPrice += s.getPrice();
		}
		return totalPrice;
	}

	public void printProducts() {
		products.forEach(x -> System.out.println(x.toString()));
	}

	public List<Product> getProducts() {
		return products;
	}

}
