package shop;

public class StudentDiscountedProduct extends DiscountedProduct {

	public StudentDiscountedProduct(Product myProduct, int percentageDiscount) {
		super(myProduct, percentageDiscount);

	}

	@Override
	public double getPrice() {
		return super.getPrice() - getDiscount();
	}

	@Override
	public double getDiscount() {
		return (getPercentageDiscount() * super.getPrice()) / 100;
	}

	@Override
	public String toString() {
		return super.toString() + " Scontato del " + getPercentageDiscount() + "%" + " (Sconto studenti) " + "\n";

	}

}
