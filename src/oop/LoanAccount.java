package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("LoanRate");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("LoanincreaseRate");
		
		
	}
	public void setTerm(int term) {
		System.out.println("Setting the term to: " + term + " years.");
		
	}
	public void AmortSchedule() {
		System.out.println("Amortization schedule ");
	}
	

	
}
