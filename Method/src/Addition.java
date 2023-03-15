//7.Print Addition
public class Addition {
	
	int add (int x, int y, int z)        //return type method
	{
		int res = x+y+z;
		return res;
	}

	public static void main(String[] args) {
		Addition a1 = new Addition();
		int result = a1.add(10, 20, 30);  //value store in result container
		System.out.println(result);
		

	}

}
