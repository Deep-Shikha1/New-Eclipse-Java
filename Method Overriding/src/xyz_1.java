//6 calling parent method using child class object by adding super keyword.
public class xyz_1 extends test_1{
	
	void show()
	{ 
		super.show();    // if we have same method in parent and class then add super keyword with method to call parent method 1st 
		System.out.println("2");
	}

	public static void main(String[] args) {
		xyz_1  ob = new xyz_1();
		ob.show();
		
				
		

	}

}
