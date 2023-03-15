
//2.Indirect Initialization(given value using object reference)

public class Carr {
	
	String name; //States
	int price;
	String brand;
	

	public static void main(String[] args) {
		Carr car = new Carr();   //to call a Constructor need to Object creation
		car.name = "Honda city";
		car.price = 1000;
		car.brand = "Suzuki";
		
		Carr car1 = new Carr();   //Constructor
		car.name = "Aulto";
		car.price =2000;
		car.brand = "Maruti";
		
		System.out.println(car.price );
		System.out.println(car.name + " " + car.price + " " + car.brand);
		System.out.println(car1.price );

	}

}
