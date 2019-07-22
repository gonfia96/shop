package shop;

import java.util.Iterator;

public class HigherPriceVisitor implements ProductVisitor {
	private double max = 0.0;

	@Override
	public void singleProductVisit(SingleProduct prod) {
		if (prod.getPrice() > max) {
			max = prod.getPrice();
		
		}

	}

	@Override
	public void packageVisit(Package pack) {

		Iterator<Product> sh = pack.getIterator();
		while (sh.hasNext()) {
			Product current = sh.next();
			current.accept(this);
		}

	}

	public double getMax() {
		return max;
	}

}
