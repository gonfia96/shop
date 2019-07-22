package shop;

public class CashPaidBill extends DecoratedBill {

	public CashPaidBill(Bill myBill, Payment payment) {
		super(myBill, payment);
	}

	@Override
	public void print() {
		getMyBill().print();
		try {
			getPayment().printPaymentData();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
