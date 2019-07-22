package shop;

public abstract class DecoratedBill implements Bill {
	private Bill myBill;
	private Payment payment;

	public DecoratedBill(Bill myBill, Payment payment) {
		super();
		this.myBill = myBill;
		this.payment = payment;
	}

	@Override
	public void addObserver(BillObserver observer) {
		myBill.addObserver(observer);

	}

	@Override
	public void removeObserver(BillObserver observer) {
		myBill.removeObserver(observer);

	}

	@Override
	public void notifyObserver(BillObserver observer) {
		myBill.notifyObserver(observer);

	}

	@Override
	public abstract void print();

	public Bill getMyBill() {
		return myBill;
	}

	public Payment getPayment() {
		return payment;
	}

}
