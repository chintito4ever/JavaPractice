package practice;

public class Car {
	
	static String model;
	int modelYear;
	String modelColor;
	
	Car(String model, int modelYear, String modelColor){
		this.model = model;
		this.modelYear = modelYear;
		this.modelColor = modelColor;
	}
	
	public static void start() {
		System.out.println("Car has started!");
	}
	public static void stop() {
		System.out.println("Car has stopped!");
	}

}


