package shop;

import java.util.ArrayList;
import java.util.List;

public class UnpaidBill implements Bill {
	private List<BillObserver> observers = new ArrayList<BillObserver>();
	private ShoppingCart sc;

	public UnpaidBill(ShoppingCart sc) {
		super();
		this.sc = sc;
		addObserver(new UpdateBillObserver());
	}

	public void print() {
		System.out.println("================================================================");
		System.out.println("Electro shop\n");
		System.out.println("Articoli presenti nel carrello:\n\n");
		sc.getProducts().forEach(p -> System.out.println(p.toString()));
		System.out.println("Totale : " + sc.getPrice());
		System.out.println("================================================================");
	}

	@Override
	public void addObserver(BillObserver o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(BillObserver o) {
		observers.remove(o);

	}

	@Override
	public void notifyObserver(BillObserver o) {
		o.update(this);

	}

	public void notifyAllObservers() {
		observers.forEach(o -> o.update(this));
	}

}
