//6.Print area and perimeter of rectangle, triangle, square, circle

public class Rectangle {
	
	public static void main(String[] args) {
		int x=2;
		int y=4;
		int z=6;
		
		
		//rectangle
		System.out.println("area of rectangle = " + x*y);
		System.out.println("perimeter of rectangle = " + 2*(x+y));
		
		
		//triangle
		System.out.println("area of triangle = " + (x*y)/2);       //0.5*(x*y)
		System.out.println("perimeter of triangle = " + (x+y+z));
		
		
		//square
		System.out.println("area of square =" + x*x);      
		System.out.println("perimeter of square  = " + 4*x);	
		
		//circle
		System.out.println("area of circle =" + (3.14*x*x));   
		System.out.println("perimeter of circle = " + (2*x*y));

	}

}
