//1. toString- if we call though object refrence then it give  o/p -hascode of Employee1 

public class Employee1 {
	
	String name;
    int id;
    String company;

Employee1(String n, int i, String c)
{
	name = n;
	id = i;
	company = c;
	
}


	public static void main(String[] args) {
		

		Employee1 e1 = new Employee1("Deep", 1, "infosys");
		Employee1 e2 = new Employee1("Shikha", 2, "HCL");
		Employee1 e3 = new Employee1("Deep Shikh", 3, "TCS");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		

	}

}
