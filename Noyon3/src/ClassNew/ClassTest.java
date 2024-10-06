package ClassNew;

import java.util.Scanner;

public class ClassTest {
	public static void main(String[] args) {
		
		int a,b;
		System.out.println("Enter your value for a , b :");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
	
		System.out.println("Addition two number="+(a+b));
		System.out.println("Subtraction two number="+(a-b));
		System.out.println("Multiplication two number="+(a*b));
		System.out.println("Division two number="+(a/b));
		System.out.println("Modulous two number="+(a%b));
		


	}
}
