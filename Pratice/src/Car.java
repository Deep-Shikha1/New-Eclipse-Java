
//1.Direct Initialization(given direct value)

public class Car {
	
	String name="Honda city"; //states
	int id=123;
	String brand="suzuki";
	
	
	public static void main(String[] args) {
	Car Car = new Car();      //Constructor
	System.out.println(Car.name);
	System.out.println(Car.id);
	
	
	Car Car1 = new Car();     //Constructor
	System.out.println(Car1.id);  // all the objects will take same initialization value
			
	
	

	}

}
