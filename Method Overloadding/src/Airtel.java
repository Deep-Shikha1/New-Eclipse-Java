
//1.Method Overloading --- more than one method having same method name but different signature

public class Airtel {                      
	
	
	void payment(int pin)                  //non static method    using same method name
	{
		System.out.println("payment via card");
	}

	static void payment(int pin, String upi)    //static method
	{
		System.out.println("payment via upi");
	}
	
	void payment(String name, int cvv)          //non static method
	{
		System.out.println("payment via ATM");
	}
	void payment(String name, int cvv, double otp)          //non static method
	{
		System.out.println("payment via OTP");
	}
	
	public static void main(String[] args) {
		payment(123, "123@ybl");     //calling static method without object reference
		Airtel a1 = new Airtel();
		a1.payment(123);            //calling non static method object reference
		a1.payment("ram", 111);     //calling non static method object reference
		a1.payment("shyam", 122, 12.4);
	}
}
