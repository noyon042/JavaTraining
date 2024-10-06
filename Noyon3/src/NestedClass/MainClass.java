package NestedClass;

public class MainClass {

	public static void main(String[] args) {
		
		OuterClass.InnerClass obj= new OuterClass.InnerClass();
		System.out.println(obj.result);
		System.out.println(obj.e);
	}
}
