//3.Final method  (method cannot be override)
 public class Test2 {
	
	final void m1()         //add final
	{
		System.out.println("this is Test2 method");
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.m1();
		

	}

}
