package shop;

public abstract class Customer {
	private static int idCount = 0;
	private final int id;
	private double budget;
	private ShoppingCart sc = new ShoppingCart();

	public Customer(double budget) {
		this.id = idCount++;
		this.budget = budget;
	}

	public abstract void takeProduct(Product p);

	public abstract void leaveProduct(Product p) throws Exception;

	public abstract void pay() throws Exception;

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public ShoppingCart getSc() {
		return sc;
	}

	public int getId() {
		return id;
	}
}
