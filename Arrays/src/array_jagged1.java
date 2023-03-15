//9.declaration, creation inzitialization are in different different lines
public class array_jagged1 {

	public static void main(String[] args) {
		
		int [][] a;                  //declaration
		a = new int[2][];            //creation
		
		a[0] = new int[4];
		a[1] = new int[3];
		
		a[0][0]=10;                        //initialization
		a[0][1]=20;
		a[0][2]=30;
		a[0][3]=40;
		a[1][0]=50;
		a[1][1]=60;
		a[1][2]=70;
		
		System.out.println(a[0][2]);
		System.out.println(a[1][2]);
		
	}

}
