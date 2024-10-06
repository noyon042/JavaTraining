package MultiLevel;

public class SubClass2 extends SubClass1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
    SubClass2 obj=new SubClass2();
	int cal=obj.calculateValue(2,3,4);
	System.out.println("Sum of three values:"+cal);
	
	String name=obj.name("mahmud ","taj");
	System.out.println(name);
	obj.newname();
	
}
		
	}


