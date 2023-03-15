//2.Method overriding (calling method for which object is created)
public class Test2 extends Test1 {
	
	void show()
	{
		System.out.println("this is Test2 method");
	}


	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.show();
		//t1.show(); // error-- because calling method for which object is created
		
		Test1 t1 = new Test1();
		t1.show();
		t2.show();
		

	}

}
