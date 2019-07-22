package shop;

public class BankAccount {
	private static int idCount = 0;
	private String ownerName;
	private final int id;
	private double balance;

	public BankAccount(String ownerName, double balance) {
		super();
		this.ownerName = ownerName;
		this.id = idCount++;
		this.balance = balance;
	}

	public void depositCash(double amount) {
		balance += amount;
	}

	public void takeCash(double amount) {
		balance -= amount;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
