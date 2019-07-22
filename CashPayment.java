package shop;

public class CashPayment extends Payment {
	private double customerCash;

	public CashPayment(ShoppingCart cart, double customerCash) {
		super(cart);
		this.customerCash = customerCash;
	}

	private double getChange() {
		return getCustomerCash() - getCart().getPrice();
	}

	@Override
	public void printData() {
		if (!checkCustomerCash()) {
			throw new IllegalArgumentException("L'importo inserito non è sufficiente");
		}
		System.out.println("Contante inserito: " + getCustomerCash());
		System.out.println("Resto: " + getChange());
	}

	public double getCustomerCash() {
		return customerCash;
	}

	public void setCustomerCash(double customerCash) {
		this.customerCash = customerCash;
	}

	private boolean checkCustomerCash() {
		return (customerCash >= getCart().getPrice());
	}
}
