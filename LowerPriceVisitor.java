package shop;

import java.util.Iterator;

public class LowerPriceVisitor implements ProductVisitor {
	private double min = Double.POSITIVE_INFINITY;

	@Override
	public void singleProductVisit(SingleProduct prod) {
		if (prod.getPrice() < min) {
			min = prod.getPrice();
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

	public double getMin() {
		return min;
	}

}
