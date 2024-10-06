package class2;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a,b,c;
		System.out.println("Enter your value for a , b and c :");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		System.out.println("Addition two number="+(a+b));
		System.out.println("Subtraction two number="+(a-b));
		System.out.println("Multiplication two number="+(a*b));
		System.out.println("Division two number="+(a/b));
		System.out.println("Modulous two number="+(a%b));
		
		System.out.println("a="+(a+5));
		System.out.println("b="+(b+7));
		
		//Relational operation
		System.out.println("Relational operation==");
		System.out.println("Less than="+(a<b));
		System.out.println("greter than="+(a>b));
		System.out.println("greter than equal="+(a>=b));
		System.out.println("Less than="+(a<c));
		System.out.println("Less than equal="+(a<=c));
		System.out.println("greter than equal="+(a>=c));
		System.out.println("not equal="+(a!=c));
		
		//Logical operation
		System.out.println("And operator="+((a<b)&&(c<a)));
		System.out.println("Or operator="+((a<b)||(c<b)));
		System.out.println("not equal operator="+!(a==c));
		
	}

}
