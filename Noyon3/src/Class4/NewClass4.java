package Class4;

public class NewClass4 {
	public static void main(String[] args) {

		NewClass5 obj=new NewClass5();
		int value=obj.calculateValue(12,5,7);
		System.out.println(value);
		obj.name();
		String name=obj.name("Mahmud","Taj");
		System.out.println(name);
        int newname=obj.name(28);
    	System.out.println(newname);
		
		
	}
}
