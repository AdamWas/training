package basics;

public class Weather {
	public static void main(String[] atgs) {
		int temperature = 85;
		String sunCondition = "Sunny";
		
		if(temperature > 80) {
			System.out.println("Shorts and t-shirt");
		}
		else if (temperature > 60 && sunCondition == "Sunny") {
			System.out.println("long-sleeve");
		}
		else {
			System.out.println("cold day");
		}
	}
}
