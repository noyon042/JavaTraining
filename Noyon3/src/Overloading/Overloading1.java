package Overloading;

import MultiLevel.SubClass2;

public class Overloading1 extends Subclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloading1 obj=new Overloading1();
		int cal=obj.calculate(2,3,4);
		System.out.println("calculate values:"+cal);
		

			int calculate=obj.calculate(2,3);
			System.out.println("calculate values:"+calculate);
			
			int calculate2=obj.calculate(2);
			System.out.println("calculate values:"+calculate2);
	}

}
