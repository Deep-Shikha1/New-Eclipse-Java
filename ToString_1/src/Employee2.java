//toString-- i. Keeping the same method, changing the method logic[Overriding]
 //          ii.Everytime when we print the object reference internally toString() is getting called and 
 //                  which is responsible for providing object reference.
 //          iii.It ispresenyt in Object class

public class Employee2 {
	                                            ////@override
	String name;                                 //    public String toString()
    int id;                                      //     {
    String company;                              //        return name +" " + id +" " + company;
                                                 //      }
   Employee2( String n, int i, String c)
 {
	name = n;
	id = i;
	company = c;
	
 }
   //@override
   public String toString()
   {
	   return name +" " + id +" " + company;
   }
   

	public static void main(String[] args) {
		
		Employee2 e1 = new Employee2("Deep", 1, "infosys");
		Employee2 e2 = new Employee2("Shikha", 2, "HCL");
		Employee2 e3 = new Employee2("Deep Shikha", 3, "TCS");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		

	}

}
