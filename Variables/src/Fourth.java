//4.Global Variable --> i.static--No Object creation   ii.non static variable-- Need of Object creation

public class Fourth {
	
	static int a = 10;       //static variable
	double b = 4.5;          //non static variable
	
	static void light()    //static method
	{
		System.out.println("This is static light");
	}

	
	
	void dim()       //non static method
	{
		System.out.println("This is non static deam");
	}
	
	

	public static void main(String[] args) {
		light();                   //calling static method without Object Reference
		System.out.println(a);     //getting value of a without using Object Reference       //a = 20; it will update value of a
		
		Fourth f1 = new Fourth();
		f1.dim();                  //calling non static method with Object Reference
		System.out.println(f1.b);  //getting value of b using Object Reference             //f1.b = 7.5; it will update value of b	
	}

}
