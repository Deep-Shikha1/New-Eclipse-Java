//8.Child class1(Hierarchical level inheritance)          //take only parent property 
public class Y extends X{
	
	
	void showY()
	{
		System.out.println("y class method");
	}


	public static void main(String[] args) {
		Y y1 = new Y();
		y1.showX();
		y1.showY();
	

	}

}
