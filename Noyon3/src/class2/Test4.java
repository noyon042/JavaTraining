package class2;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		
		System.out.println("enter two value");
		
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		
		if(a>b) {
			System.out.println("multiplication is="+(a*b));
		}
		else {
			System.out.println("subtraction is="+(a-b));
		}
		
		
	}

}
