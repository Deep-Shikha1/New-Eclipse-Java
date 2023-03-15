//14.Parent class2(Multiple inheritance)(not in java)      //more than one parents
public class Mother extends Father {
	
	
	void showM()
	{
		System.out.println("Mother class method");
	}

	public static void main(String[] args) {
		Mother m1  = new Mother();
			m1.showM();
			m1.showF();
			
		

	}

}


