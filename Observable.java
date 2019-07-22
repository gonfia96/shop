package shop;

public interface Observable<T> {
	public void addObserver(T observer);

	public void removeObserver(T observer);

	public void notifyObserver(T observer);
}
