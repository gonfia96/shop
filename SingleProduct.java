package shop;

public class SingleProduct implements Product {
	private double price;
	private String name;

	public SingleProduct(double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public void add(Product s) throws Exception {
		throw new IllegalArgumentException("Impossibile");
	}

	@Override
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void accept(ProductVisitor v) {
		v.singleProductVisit(this);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "Nome articolo: " + getName() + " Prezzo: " + getPrice() + "\n";
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (o instanceof SingleProduct) {
			SingleProduct other = (SingleProduct) o;
			return ((other.getPrice() == this.getPrice()) && (other.getName() == this.getName()));
		}
		if (o instanceof DiscountedProduct) {
			return o.equals(this);
		}
		return false;

	}
}