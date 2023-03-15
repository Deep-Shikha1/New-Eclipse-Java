//5.Final class ---Class cannot be inherit
public final class Test3 {                      //add final before class
	

	 void m1()       
	{
		System.out.println("this is Test2 method");
	}


	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.m1();
		

	}

}
