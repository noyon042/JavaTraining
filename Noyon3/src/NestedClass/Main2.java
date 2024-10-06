package NestedClass;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Nestedclass1 obj=new Nestedclass1();
		Nestedclass1.InnerClass1 obj1=obj.new InnerClass1();
		obj1.calculate();
	}

}
