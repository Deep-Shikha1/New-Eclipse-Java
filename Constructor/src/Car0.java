//0.Default Constructor

public class Car0 {

	int id;
	String name;
	
	//  Car0()           Default constructor (Automatically created at the time of Object creation) user not able to see
	//   {
		
	//   }
	
	
	public static void main(String[] args) {
		Car0 c1 = new Car0();
		System.out.println(c1.id);               //print default value of int
		System.out.println(c1.name);             //print default value of String
	}

}
