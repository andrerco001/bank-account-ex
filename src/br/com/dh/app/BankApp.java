package br.com.dh.app;

import br.com.dh.account.Account;
import br.com.dh.account.SavingAccount;
import br.com.dh.customer.Customer;

public class BankApp {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(01, "Marques", 123, "7917263");
		Account accSaving01 = new SavingAccount(12345, c1, 5000.00, "SAVING");
		
		System.out.println(c1.toString());
		System.out.println(accSaving01.toString());

		accSaving01.depositCash(250.0);

		double currentBalance = accSaving01.currentBalance();
		System.out.println("Current balance: " + currentBalance);
		
		System.out.println(accSaving01.toString());

		
	}

}
