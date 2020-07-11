package oop;

class Person{
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
		
	
	
	void email() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
		
	}
}
public class Demo {

	public static void main(String[] args) {
		//instantiaing an object
		Person person1 = new Person();
		
		//Define some properties
		person1.name = "Manoj";
		person1.email ="mkumar11@sapient.com";
		person1.phone ="22423422";
		
		//Abstraction
		person1.sleep();
		//person1.walk();
		//person1.email();
		
		Person person2 = new Person();
		person2.name = "Test";
		person2.walk();
		
		
		/*
		//Attributes, variables, adjectives, descriptors
		String name = "Manoj Kumar";
		String email = "mkumar11@sapient.com";
		String phone = "928729229";
		
		//action, activity, behavior
		//System.out.println(name + " like walking.");
		walking(name);
		System.out.println(name + " like eating.");
		
		String name2 = "Test  Kumar";
		String email2 = "Test@sapient.com";
		String phone2 = "832329229";
		
		walking(name2);
		System.out.println(name2 + " like eating.");
		
		//Binding attributes and properties together
	}
	//enhance by adding the functions to minimize the code
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
	}

}
