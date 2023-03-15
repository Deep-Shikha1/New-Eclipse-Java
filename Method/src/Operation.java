//4.Return type method but returntype value is not stored in any container.
public class Operation {
	
	                                                              //Rules::
	int m1()                                                      // returntype methodname()
	{                                                             //  {
		System.out.println("This is m1 method");                  //     instructions
		return 10;                                                //      return value;
	}                                                             //  }
	
	
	String name()
	{
		System.out.println("This is name method");
		return "Deep";
	}

	
	public static void main(String[] args) {
		Operation o1 = new Operation();
		o1.m1();             // not getting o/p as 10 and Deep because return value is not stored in any container
		o1.name();
	}

}
