//3. same return type or parent class above

public class test {
                                        //always parent class
	 Object show()                      //  test.java          xyz.java
	{                                  //Object show()  ,,   String show()    --possible
		System.out.println("1");       // String show() ,,   Object show()    --not possible
		return null;                   //String show()  ,,   String show()    --possible
	}                                
	                                  //Access modifiers
                                     //public Object show() ,,   public String show()   --possible
}                                    //public Object show() ,,   String show()          --not possible (child class modifiers should always larger)
                                     //Object show()        ,,   public String show()   --possible     (Child class modifiers is larger than parent class)