//6.Returntype method, Print total marks, percentage **
public class marks {
	
	int person1(int phy, int chem, int math)       //return type method
	{
		int totalmarks = phy + chem + math;       //instruction
		return totalmarks;                        //return value
	}
	
	
	double person2(int total)                    //returntype method
	{
		double perc = (total/300.0)*100.0;       //instruction
		return perc;                             //return value
	}
	

	public static void main(String[] args) {
		marks m1 =  new marks();
		int sum = m1.person1(10,20,30);
		System.out.println(sum);
		
		double y = m1.person2(sum);
		System.out.println(y);
				
	

	}

}
