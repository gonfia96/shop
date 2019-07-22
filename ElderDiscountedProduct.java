package shop;

public class ElderDiscountedProduct extends DiscountedProduct {

	public ElderDiscountedProduct(Product myProduct, int percentageDiscount) {
		super(myProduct, percentageDiscount);
	}

	@Override
	public double getPrice() {
		return super.getPrice() - getDiscount();
	}

	public double getDiscount() {
		return (getPercentageDiscount() * super.getPrice()) / 100;
	}

	@Override
	public String toString() {
		return super.toString() + " Scontato del " + getPercentageDiscount() + "%" + " (Sconto vecchiaia) " + "\n";

	}

}
