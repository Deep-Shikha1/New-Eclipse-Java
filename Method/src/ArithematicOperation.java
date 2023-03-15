//8.Print add, sub, mul, div
public class ArithematicOperation {
	
	void numbers(int x, int y)
	{
		int add = x+y;
		int sub = x-y;
		int mul = x*y;
		int div = x/y;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}

	public static void main(String[] args) {
		ArithematicOperation a1 = new ArithematicOperation();
		a1.numbers(10,20);
		a1.numbers(60,20);
		a1.numbers(80,20);
		a1.numbers(10,20);
		
		

	}

}
