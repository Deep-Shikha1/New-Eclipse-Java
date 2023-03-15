//4.Final method   (method overriding concepts--same method name,no. parameter,order of parameter& Inheritance concepts)
public class Demo2 extends Test2 {
	
	
	//void m1()              //after final in Test2 class -- o/p-error (final method cannot be inherit)
	{
		System.out.println("this is Demo2 method");
	}

	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		d2.m1();
		//t2.m1();
			
		

	}

}
