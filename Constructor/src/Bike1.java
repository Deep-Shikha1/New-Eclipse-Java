//4.First direct initialization then re initialization then calling using Object Reference
public class Bike1 {
	
	String name = "R15";    //Direct Initialization
	int price = 2000;
	String brand = "XYZ";
	
	Bike1(String n, int p, String b)     //Constructor(save no. of lines)
	{
		name = n;               //value of name initialize in n
		price = p;              //value of price initialize in p
		brand = b;
	}

	public static void main(String[] args) {
		Bike b1= new Bike("CVZ",2200, "Hero");
		b1.name = "discover";    //Reinitializing   using Object Reference
		b1.price = 30000;        //Reinitializing   using Object Reference
		b1.brand = "Bajaj";      //Reinitializing   using Object Reference
		System.out.println(b1.name);
		System.out.println(b1.price);
		System.out.println(b1.brand);
		

	}

}
