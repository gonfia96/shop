package shop;

public class ElderCustomer extends PrivateCustomer {

	

	public ElderCustomer(String name, String surname, double budget) {
		super(name, surname, budget);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takeProduct(Product p) {
		getSc().add(new ElderDiscountedProduct(p, 20));
	}

}
