package basics;

public class Cities {
	public static void main(String[] args) {
		String[] cities = {"NY", "SFO", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
	
		String[] state = new String[5] ;
		state[0] = "California";
		state[1] = "Ohio";
		state[2] = "NJ";
		state[3]="Texa";
		state[4]="Utah";
		System.out.println(state[0]);
		
		String[] countries;
		
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "UK";
		countries[2] ="Canada";
		System.out.println(countries[0]);
		
		System.out.println("-----------------");
		
		String[] states = new String[5] ;
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "NJ";
		states[3]="Texas";
		states[4]="Utah";
		int i=0;
		do {
			System.out.println("States : " + states[i]);
			i = i +1;
		}while (i <5);
		
		int n = 0;
		boolean statefound = false;
		while(!statefound){
			String statem = states[n];
			System.out.println(statem);
			if (statem == "Texas") {
				System.out.println("Statefound");
				statefound = true;
			}
			
			n++;
			
			
		}
		
		//For loop
		System.out.println("For Loop");
		for (int x=0; x < 5; x++) {
			System.out.println(states[x]);
		}
	}

}
