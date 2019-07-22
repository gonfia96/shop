package shop;

public interface Bill extends Observable<BillObserver> {
	public void print();

}
