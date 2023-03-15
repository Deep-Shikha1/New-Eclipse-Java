 //1.this keyword represent current Object Reference --(s1.name,s1.id) (s2.name, s2.id)
	
public class Student {
	
	String name;             //GV =LV
	int id;                                        //assing value of parameter name to state name
	
	Student(String name, int id)     /////this keyword represent current Object Reference --(s1.name,s1.id) (s2.name, s2.id)
	{
		this.name=name;                //name=name --- o/p-null         ((state container = parameter container))
		this.id=id;                    //id=id  ---o/p-0
	}

	public static void main(String[] args) {
		Student s1 = new Student("Deep", 123);
		System.out.println(s1.name);
		System.out.println(s1.id);
		
		Student s2 = new Student("Shikha", 111);     //(two objects are present so it will print both the value don't overlap)
		System.out.println(s2.name);                 //(If only one object is present then it will give updated value)
		System.out.println(s2.id);
		

	}

}
