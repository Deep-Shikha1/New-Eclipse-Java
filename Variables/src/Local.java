//2.Local Variable
public class Local {
	

	String name;   //Global Variable (inside class but outside the Constructor, Method, Main method)
	int price;     //Global Variable

	Local()    
	{
		
	}
	
	void Study()
	{
		System.out.println("Studing");
	}

	public static void main(String[] args) {
		
		int x = 100;        //Local Variable(inside the class, Constructor, Main Method)
		int y = 200;
		int res = x+y;
		System.out.println(res);
		
		

	}

}
