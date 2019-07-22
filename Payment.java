package shop;

public abstract class Payment {
	private ShoppingCart cart;
	private Bill bill;

	public Payment(ShoppingCart cart) {
		super();
		this.cart = cart;
		bill = new UnpaidBill(cart);

	}

	public void printPaymentData() {
		System.out.println("Dati pagamento:\n");
		try {
			checkCart();
			printData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void checkCart() {
		if (cart.isEmpty()) {
			throw new IllegalArgumentException("Il carrello è vuoto");
		}
	}

	public abstract void printData() throws Exception;

	public ShoppingCart getCart() {
		return cart;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

	public Bill getBill() {
		return bill;
	}


}
