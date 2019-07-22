package shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Package implements Product {
	private List<Product> products = new ArrayList<Product>();
	private String name;

	public Package(String name) {
		super();
		this.name = name;
	}

	@Override
	public double getPrice() {
		double totalPrice = 0.0;

		for (Product s : products) {
			totalPrice += s.getPrice();
		}
		return totalPrice;
	}

	@Override
	public void add(Product s) {
		products.add(s);
	}

	@Override
	public void accept(ProductVisitor v) {
		v.packageVisit(this);

	}

	public Iterator<Product> getIterator() {
		return products.iterator();
	}

	public List<Product> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "Nome pacchetto: " + name + "\n" + "Prodotti inclusi :\n" + products.toString() + " ";
	}

	public void printProduct() {
		System.out.println(this.toString());
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (o instanceof Package) {
			Package other = (Package) o;
			return ((this.getName() == other.getName()) && (this.getProducts() == other.getProducts()));
		}
		if (o instanceof DiscountedProduct) {
			return o.equals(this);
		}
		return false;
	}

}
