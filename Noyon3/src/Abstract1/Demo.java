package Abstract1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class2 obj=new Class2();
		int B=obj.calculate();
		System.out.println("Addition="+B);
		int C=obj.add(4,6,9);
		System.out.println("Addition for three value="+C);
		
		Class3 obj1=new Class3();
		int d=obj1.add(4,4,9);
		System.out.println("Multiplication for three value="+d);
		int c=obj1.calculate();
		System.out.println("Multiplication="+c);
	}

}
