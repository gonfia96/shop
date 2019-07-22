package shop;

public class ElectronicPaidBill extends DecoratedBill {

	public ElectronicPaidBill(Bill myBill, Payment payment) {
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
