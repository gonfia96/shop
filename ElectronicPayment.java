package shop;

public class ElectronicPayment extends Payment {
	private Bank bank;
	private BankAccount acc;

	public ElectronicPayment(ShoppingCart cart, BankAccount acc, Bank bank) {
		super(cart);
		this.acc = acc;
		this.bank = bank;
	}

	@Override
	public void printData() {
		if (!checkCustomerAccount()) {
			throw new IllegalArgumentException("Il conto non esiste");
		}
		if (!checkAccountCash()) {
			throw new IllegalArgumentException("Non hai abbastanza soldi nel conto");
		}
		System.out.println("Banca: " + bank.getName());
		System.out.println("Conto n.: " + acc.getId());
		System.out.println("Acquirente: " + acc.getOwnerName());
		System.out.println("Pagamento effettuato con successo");

	}

	private boolean checkCustomerAccount() {
		return bank.check(acc);
	}

	private boolean checkAccountCash() {
		return acc.getBalance() >= getCart().getPrice();
	}

}
