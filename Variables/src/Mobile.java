//3.Both Gobal variable and Local variable
public class Mobile {
	
	String name;   ///Global Variable
	int price;
	
	
	Mobile()
	{
	name="MI";     //Local Variable
	price = 1000;  //Local Variable
	}
	
	void call()
	{
		System.out.println("Calling");    //Local Variable
	}
	

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		System.out.println(m1.price);
		m1.call();
		

	}

}
