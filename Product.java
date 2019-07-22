package shop;

public interface Product {
	public void add(Product s) throws Exception;

	public double getPrice();

	public void accept(ProductVisitor v);

	public String getName();
}
