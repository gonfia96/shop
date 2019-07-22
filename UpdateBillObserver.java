package shop;

public class UpdateBillObserver extends BillObserver {

	@Override
	public void update(UnpaidBill b) {
		b.print();
	}

}
