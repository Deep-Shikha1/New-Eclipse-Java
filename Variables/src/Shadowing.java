
//6.Variable Shadowing --> when GV and LV name is same then LV dominates over GV


public class Shadowing {                
	
	int x=100;    //Global variable
	
	void show()                                       //inside method  void show(int x)      s1.show(20)  --- Local variable  ---o/p- 20
	{
		int x=200;     //Local variable
		System.out.println(x);       //Calling Local variable
		System.out.println(x);       //Calling Local variable
		System.out.println(this.x);  //Calling Global variable

	}

	public static void main(String[] args) {
		Shadowing s1 = new Shadowing();
		s1.show();	

	}

}
