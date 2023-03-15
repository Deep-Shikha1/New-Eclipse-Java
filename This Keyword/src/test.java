//2.this keyword (method)
public class test {
	
	int i;           //GV
	
	
	void setvalues (int i)               //(int x)
	{                                    // i=x;
		this.i=i;              //LV      // i=i;
	}

	
	void show()
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		test t1 = new test();
		t1.setvalues(10);
		t1.show();
		

	}

}
