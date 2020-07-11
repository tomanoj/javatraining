package oop;

public class BankAccount implements IRate{

	//define variables
	String accountNumber;
	
	//static variables
	//static >> belongs to the class not the object instance
	//final >> constant (often final static)
	private static final String rountingNumber ="82928";
	
	//instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;

	//COnstructor definition : unique methods
	//1. They are used to define /setup/initialize properties of an object
	//2. Constructors are implicitly called upon instantiation
	//3. The same name as class itself.
	//4. Have no return type.
	
	BankAccount(){
		System.out.println("New Account Created:");
		
	}
	//Overloading: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("New Account: "+ accountType);
			
	}
	
	BankAccount(String accountType, double initialDeposit){
		
		//initialDeposit, accountType, Msg are local variables
		System.out.println("New Account: "+ accountType);
		System.out.println("Intial Deposit: "+ initialDeposit);
		String Msg = null;
		if (initialDeposit < 1000) {
			Msg = "Error: Minimum deposit must be $1000.";
					} else {
			Msg = "Thanks for the initial deposit" + initialDeposit;
		}
		System.out.println(Msg);
		balance = balance + initialDeposit;
	}
	
	//Getters and Setters
	//Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr." + name;
	}
	public String getName() {
		return name;
		
	}
	
	
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = "SSN: " + ssn;
	}
	
	
	//Define methods
	public void deposit(double amount) {
		
		balance = balance + amount;
		showActivity("Deposit");
	}
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("Withdraw");
		
	}
	
	//Private: can only be called  from within class
	private void showActivity(String activity) {
		System.out.println("Your recent transaction:" + activity);
		System.out.println("Your current balance : " + balance);
	
	}
	void checkBalance() {
		System.out.println("Balance :" + balance );
	
	}
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		
		return "{Name: " + name +".Account# " +  accountNumber + ". Rounting Number " +rountingNumber + "balance $ " +balance+"}";
		
	}
	
	//interface methods
	public void setRate() {
		System.out.println("Setting the rate: ");
		
	}
	public void increaseRate() {
		System.out.println("Increasing the rate: ");
	}

}
