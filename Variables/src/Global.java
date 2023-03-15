//1.Global Varialbe
public class Global {
	
	String name;   //Global Variable (inside class but outside the Constructor, Method, Main method)
	int price;     //Global Variable

	Global()           //construtor
	{
		
	}
	
	void Study()      //Method
	{
		System.out.println("Studing");
	}

	public static void main(String[] args) {
		Global g1 = new Global();
		g1.Study();
		
				
		

	}

}
