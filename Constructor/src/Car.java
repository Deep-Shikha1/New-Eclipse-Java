
//1.Constructor --> used to initialized object, member of class, special method, class name and constructor name should be name.
                   //i.Default constructor  ii.User define constructor
                   //constructor executes automatically when object will be created

public class Car {
	
	String name;
	int price;
	String brand ;
	 
	 Car()           //Initialization using Constructor             user define constructor(no-argument constructor)
	{
	    name="Honda city"; //states
		price=2000;
		brand="suzuki";	
		
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.name);
        System.out.println(c1.price);
		System.out.println(c1.brand);
		
	}

}
