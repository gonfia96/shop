package shop;

public abstract class DiscountedProduct implements Product {
	private Product myProduct;
	private int percentageDiscount;

	public DiscountedProduct(Product myProduct, int percentageDiscount) {
		super();
		this.myProduct = myProduct;
		this.percentageDiscount = percentageDiscount;
	}

	@Override
	public void add(Product s) throws Exception {
		myProduct.add(s);
	}

	@Override
	public double getPrice() {
		return myProduct.getPrice();
	}

	@Override
	public void accept(ProductVisitor v) {
		myProduct.accept(v);
	}

	public abstract double getDiscount();

	public Product getMyProduct() {
		return myProduct;
	}

	public int getPercentageDiscount() {
		return percentageDiscount;
	}

	@Override
	public String toString() {
		return myProduct.toString();
	}

	@Override
	public String getName() {
		return myProduct.getName();
	}

	@Override
	public boolean equals(Object o) {
		return myProduct.equals(o);
	}

}
