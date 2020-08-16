package br.com.dh.account;

import br.com.dh.customer.Customer;

public abstract class Account {
	
	// attributes
	protected int numberAccount;
	protected Customer customer;
	protected double balance;
	protected String type;

	public Account() {

	}

	public Account(int numberAccount, Customer customer, double balance, String type) {
		this.numberAccount = numberAccount;
		this.customer = customer;
		this.balance = balance;
		this.type = type;
	}

	// getters and setters
	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// methods
	public double currentBalance() {

		return this.getBalance();
	}

	public void depositCash(double amount) {
		
		if(amount > 0) {
			this.balance += amount;
		} else {
			System.out.println("The amount to be deposited must be greater than zero.!");
		}
	}

	public void withdrawCash(double amount) {
		
		if(this.getBalance() >= 0 && amount > 0 && amount < this.getBalance()) {
			this.balance -= amount;
		} else {
			System.out.println("Unable to withdraw. Check the amount informed.!");
		}
	}
}