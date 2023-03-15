//6.Child class2(Multi level Inheritance)             //take parent property as well as child class1 property
public class C extends B{                //C extends A --only takes parent property     -- c1.showB()-o/p-error 
	
	void showC()
	{
		System.out.println("c class method");
	}


	public static void main(String[] args) {
		C c1 = new C();
		c1.showA();     //we can call method of A because C class inherit to B class & B class inherit to A class(C extends B)& (B extends A).
		c1.showB();     //we can call method of B because C class inherit to B class(B extends A).
		c1.showC();
		
		

	}

}
