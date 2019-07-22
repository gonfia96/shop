package shop;

import java.util.Iterator;

public class CountLowerVisitor implements ProductVisitor {
	double limitmax;
	int count = 0;

	public CountLowerVisitor(double limitmax) {
		this.limitmax = limitmax;
	}

	@Override
	public void singleProductVisit(SingleProduct prod) {
		if (prod.getPrice() < limitmax) {
			count++;
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
}
