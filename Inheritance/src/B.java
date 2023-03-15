//5.Child class2(Multi level Inheritance)     //take parent property
public class B extends A {

	void showB()
	{
		System.out.println("b class method");
	}

	public static void main(String[] args) {
		
		//a1.showA();
		//b1.showB();            //o/p- error(because Object of B is not created)
		//c1.showC();            //o/p- error(because Object of C is not created)
		
		B b1 = new B();
		b1.showA();         //we can call method of A because B class inherit to C class using (B extends A).
		b1.showB();
		//b1.showC();           //o/p- error(because Object of C is not created)
		
		
		//C c1 = new C();    //o/p-- c class method because Object of C class is created in class B) 
		//c1.showC();


	}

}
