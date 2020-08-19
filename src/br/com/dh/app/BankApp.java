package br.com.dh.app;

import br.com.dh.account.Account;
import br.com.dh.account.SavingAccount;
import br.com.dh.account.TypeAccount;
import br.com.dh.customer.Customer;

public class BankApp {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(01, "Marques", 123, "7917263");
		
		Account accSaving01 = new SavingAccount(12345, customer1, 5000.00, TypeAccount.SAVING_ACCOUNT, 0.02);
		
		System.out.println(customer1.toString());
		System.out.println(accSaving01.toString());

		accSaving01.depositCash(250.0);
		
		double currentBalance = accSaving01.currentBalance();
		System.out.println("Current balance: " + currentBalance);
		
		System.out.println(accSaving01.toString());
		
		((SavingAccount) accSaving01).payMonthlyInterest();
		
		System.out.println(accSaving01.toString());

		
	}

}
