//5.Return type method and  returntype value is stored in container(int x, String y).

public class Operation1 {

	int m1()
	{
		System.out.println("This is m1 method");
		return 10;
	}
	
	
	String name()
	{
		System.out.println("This is name method");
		return "Deep";
	}

	
	public static void main(String[] args) {
		Operation o1 = new Operation();
		int x = o1.m1();           //Storing return value in a container (int x)
		System.out.println(x);
		String y = o1.name();      //Storing return value in a container (String y)
		System.out.println(y);
		

	}

}
