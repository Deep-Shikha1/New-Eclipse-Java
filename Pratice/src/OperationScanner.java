
//5.Take i/p from user and perform operation

import java.util.Scanner;
public class OperationScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("add: " + a+b);
		System.out.println("sub: " + (a-b));
		System.out.println("mul: " + a*b);
		System.out.println("div: " + a/b);
		System.out.println("mod: " + a%b);
		
	}

}