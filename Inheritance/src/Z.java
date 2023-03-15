//9.Child class2(Hierarchical level inheritance) //takes only parent property not child class1 property because(Z extends X).
public class Z extends X {                         //Z extends Y -- takes parent property as well as Child class1 property.
	
	void showZ()
	{
		System.out.println("z class method");
	}


	public static void main(String[] args) {
		Z z1 = new Z();
		z1.showX();
	  //z1.showY();     0/P-error because only Z class interit X class proprties not Z class inherit Y class
		z1.showZ();
		

	}

}
