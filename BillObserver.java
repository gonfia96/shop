package shop;

public abstract class BillObserver implements Observer<UnpaidBill> {

	@Override
	public abstract void update(UnpaidBill s);
}
