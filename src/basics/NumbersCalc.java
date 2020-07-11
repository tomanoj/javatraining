package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 10;
		addNumbers(numA, numB);
		int product = multipleNumbers(numA, numB);
		//System.out.println("The product of numbers " + numA + " and " + numB + " is " + multipleNumbers(numA, numB));
		System.out.println("The product of numbers " + numA + "and" + numB + "is" + product);
	}
	
	static void printName() {
		System.out.println("My name is Manoj");
	}
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of numbers :" + numberA + " and " + numberB + " is " +sum);
		
	}
	
	
	static int multipleNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumbers(product +50, product);
		return product;
		
	}

}
