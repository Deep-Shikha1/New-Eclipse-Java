//3.calling using parameterized constructor
public class Projector {
	
	String brand;          //states
	int price;
	float accuracy;
	
	Projector(String b, int p, float a)      //calling using parameterized constructor
	{
		brand = b;
		price = p;
		accuracy = a;	
	}
	
	void display()                          //Method creation
	{
		System.out.println("Display on Screen");
	}


	public static void main(String[] args) {
		Projector p1 = new Projector("Epson",2000, 56.2f);
		System.out.println(p1.brand);
		p1.display();    //Method calling using Object Reference
		
		

	}

}
