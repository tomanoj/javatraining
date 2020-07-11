package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitles;
		String wordChoice = "Ring";
		bookTitles ="The lord of Rings";
		if (bookTitles.contains(wordChoice)){
			System.out.println("The book contains the word " + wordChoice);
			}
		
		System.out.println("Testing the chrome");
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")){
				System.out.println("The browser is chrome");
	}
		String firstName = "Manoj";
		String lastName = "Kumar";
		String  SSN = "929292929";
		
		System.out.println(firstName.substring(0,1));
		System.out.println(lastName.substring(0,1));
		System.out.println(SSN.substring(5));
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		

	}
}
