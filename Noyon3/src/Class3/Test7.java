package Class3;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
			
		Scanner obj=new Scanner(System.in);
			System.out.println("enter three value");
			
			System.out.println("enter value for a");
			a=obj.nextInt();
			
			System.out.println("enter  value for b");			
			b=obj.nextInt();
			
			System.out.println("enter value for c");
			c=obj.nextInt();

			
			if(a>b && a>c) {
				System.out.println("A is Maximum number");
				
			}
			else if(b>a && b>c){
				System.out.println("B is Maximum number");
				
			}
			else {
				System.out.println("C is Maximum number");
			}
			
	}

}
