package shop;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String name;
	List<BankAccount> accounts = new ArrayList<BankAccount>();

	public Bank(String name) {
		super();
		this.name = name;
	}

	public void addAccount(BankAccount acc) {
		accounts.add(acc);
	}

	public boolean check(BankAccount acc) {
		return accounts.contains(acc);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}

}
