
//3. initialized using Object Reference
public class Bike {
	
	String name;
	int price;
	String brand;
	
	
	Bike(String n, int p, String b)                // initialized using Object Reference 
	{
		name=n;                           //value of name is initialize in n
		price=p;                          //value of price initialize in p
		brand=b;
	}

	public static void main(String[] args) {
		Bike b1 = new Bike("CVZ",2200, "Hero");
		b1.name= "discover";    //Reinitializing
		b1.price = 30000;        //Reinitializing
		b1.brand = "Bajaj";      //Reinitializing
		System.out.println(b1.name);               //updated value will print
		System.out.println(b1.price);
		System.out.println(b1.brand);
		
		
		

	}

}
