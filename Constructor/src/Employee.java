//2.Parameterized constructor

public class Employee {
	
	String name;
	int id;
	String company;
	
	Employee(String n, int i, String c)     //Calling using parameterized constructor(to avoid default value)
	{
	    name=n;                              //Rules
		id=i;                                //i.No. of parameter = No. of argument passed
		company=c;                           //ii.datatype of parameter = data type of argument passed
	}                                        //iii.Order of parameter = Order of argument passed

	public static void main(String[] args) {
		Employee e1= new Employee("anjali",123,"HCL");
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e1.company);
		
		
		Employee e2= new Employee("sandeep",456,"INFO");
		System.out.println(e2.name);
		System.out.println(e1.id);
		System.out.println(e2.company);
		

	}

}
