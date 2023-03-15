//1.Method Creation
public class Test {
	
	void Testing()         //Method creation
	{
		System.out.println("Testing");
		System.out.println("SDLC");
	}
	
	
	void Developing()     //Method creation
	{
		System.out.println("Development");
		System.out.println("STLC");
		
	}
	

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.Testing();          //calling method using Object Reference
		t1.Developing();      //calling method using Object Reference
		t1.Testing();
		//t2.Testing();     
		
		Test t2 = new Test();
		t2.Testing();
		t1.Developing();

	}

}
