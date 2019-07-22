package shop;

public abstract class PrivateCustomer extends Customer {
	private String name;
	private String surname;

	public PrivateCustomer(String name, String surname, double budget) {
		super(budget);
		this.name = name;
		this.surname = surname;
	}

	@Override
	public abstract void takeProduct(Product p);

	@Override
	public void leaveProduct(Product p) throws Exception {
		try {
			if (!getSc().getProducts().contains(p)) {
				throw new IllegalArgumentException("Prodotto non presente nel carrello");
			}
			getSc().remove(p);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void pay() throws Exception {
		try {
			if (getBudget() < getSc().getPrice()) {
				throw new IllegalArgumentException("Non hai abbastanza soldi");
			}
			// getBudget() -= getSc().getPrice();
			setBudget(getBudget() - getSc().getPrice());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
