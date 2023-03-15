//11.Parent class2(Multiple inheritance)(not in java)      //more than one parents
public class T extends S {
	
	
	void showT()
	{
		System.out.println("t class method");
	}

	public static void main(String[] args) {
		T t1 = new T();
			t1.showT();
			t1.showS();
			
		

	}

}
