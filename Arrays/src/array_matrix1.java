//6.declaration then creation then initialization is in different diffferent lines
public class array_matrix1 {

	public static void main(String[] args) {
		
		int[][] a;                 //declaration
		a = new int[2][3];         //creation
		a[0][0]=10;                //initialization
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		
		System.out.println(a[0][2]);
		System.out.println(a[1][2]);
		

	}

}
