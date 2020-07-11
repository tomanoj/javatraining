package basics;

public class Weather {
	public static void main (String[] args) {
		
		int temperature = 51;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println(" It's pleasant. Wear T-shorts and shorts");
		}
		else if ((temperature > 60) && (sunCondition =="Sunny")) {
			System.out.println("Temperature is little cooler");
		}
		else if ((temperature > 50) && (sunCondition !="Overcast")){
			System.out.println("Cool day, wear the warm clothes");
			
		}
		else {
			System.out.println("Looks like temperature is littler cooler");
		}
		System.out.println("End of the Game");
	}

}
