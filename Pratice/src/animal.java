
//3.Both Direct and Indirect Initialization

public class animal {
	
	//Direct Initialization
	String name = "lion";
	int weight = 200;
	String color = "brown";
	

	public static void main(String[] args) {
		animal a1 = new animal();
		a1.name="horse";    ////Indirect Initialization
		a1.weight =100;
		a1.color = "black";
		
		System.out.println(a1.name);    // old value will be replaced with new value
		System.out.println(a1.weight);
		System.out.println(a1.color);
		

	}

}
