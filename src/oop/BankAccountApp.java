package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Manoj";
		//With encapsulation: public API methods
		
		acc1.setName("Manoj Kumar");
		System.out.println(acc1.getName());
		
		acc1.setSsn("345435435");
		System.out.println(acc1.getSsn());
		
		acc1.accountNumber = "345334";
		
		acc1.balance = 10000;
		
		acc1.deposit(5000);
			
		acc1.setRate();
		acc1.increaseRate();
		
		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Saving Account");
		acc2.accountNumber ="34543545";
		
				BankAccount acc3 = new BankAccount("Checking Account", 5000);
		acc3.accountNumber ="345343543";
		acc3.checkBalance();
		
		/*
		//Inheritance using extended 
		CDAccount cd1= new CDAccount();
		cd1.accountNumber = "23423423";
		cd1.balance = 1000;
		cd1.accountType = "CD Account";
		cd1.interRate = "4.5";
		
		cd1.name = "Juan";
		System.out.println(cd1.toString());
		cd1.compound();
		
		*/
	}

}
