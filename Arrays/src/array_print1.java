//11.print all value
public class array_print1 {

	public static void main(String[] args) {
		
		int[][] a = {{10,20,30,40}, {50,60}, {70,80,90}};
		
		System.out.println(a);            //[[I@--
		System.out.println(a[0]);         //[I@
		System.out.println(a[0][0]);      //10
		System.out.println(a.length);     //3
		System.out.println(a[0].length);  //4
	  //System.out.println(a[0][0].length);  //error
		System.out.println();
		

	}

}
