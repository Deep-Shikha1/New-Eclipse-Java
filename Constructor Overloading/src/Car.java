
//1.Constructor Overloading --- more than one constructor having same constructor name but different signature

public class Car {
	
	String name;
    int price;
    String brand;
    
    
    
    Car()        //Constructor
    {
    	name="Civic";                         //this.name
    	price=20000;                          //this.price
    	brand="Honda";                        //this.brand
    }
    
    Car(String name)           //Constructor
    {
    	this.name=name;
    }
    
    Car(String name, int price)      //Constructor
    {
    	this.name=name;
    	this.price=price;
    }
    
    Car(String name, int price, String brand)      //Constructor
    {
    	this.name=name;
    	this.price=price;
    	this.brand=brand;
    }


	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.name+ " "+c1.price+" "+c1.brand);
		
		Car c2 = new Car("Fortuner");
		System.out.println(c2.name+ " "+c2.price+" "+c2.brand);

		Car c3 = new Car("Nano", 35000);
		System.out.println(c3.name+ " "+c3.price+" "+c3.brand);


	}

}
