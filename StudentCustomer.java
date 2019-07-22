package shop;

public class StudentCustomer extends PrivateCustomer {

	public StudentCustomer(String name, String surname, double budget) {
		super(name, surname, budget);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takeProduct(Product p) {
		getSc().add(new StudentDiscountedProduct(p, 10));

	}

}
