//2.Method creation and calling using Object Reference.
public class Bike {
	
	void Accelerate()                         //Method creation
	{
		System.out.println("Move Forward");   //Behavior
	}
	
	
	void StartEngine()                           //Method creation
	{
		System.out.println("Start the Engine");  //Behavior
	}
	
	void StopEngine()                            //Method creation
	{
		System.out.println("Stop the Engine");   //Behavior
	}
	

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.Accelerate();          //Method calling using Object Reference
		b1.StartEngine();         //Method calling using Object Reference
		b1.StopEngine();          //Method calling using Object Reference
		
		
		Bike b2 = new Bike();
		b2.StartEngine();         //Method calling using Object Reference

	}

}
