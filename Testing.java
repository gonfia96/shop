package shop;

public class Testing {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		HigherPriceVisitor v = new HigherPriceVisitor();
		Product pack = new Package("Pacco bello");
		try {
			pack.add(new SingleProduct(10.00, "Mouse"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//cart.add(pack);
		//cart.add(new SingleProduct(10.00, "Mouse"));
		cart.add(new StudentDiscountedProduct(new SingleProduct(10.00, "Cuffie"), 10));
		cart.remove(pack);
		Bank b1 = new Bank("Banca ML");
		BankAccount ba = new BankAccount("Lorenzo Manetti", 40.00);
		b1.addAccount(ba);
		Payment p = new ElectronicPayment(cart, ba, b1);
		Payment p1 = new CashPayment(cart, 80.00);
		p1.printPaymentData();
	}

}
