package ClassNew;

import java.util.Scanner;

public class ClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b,c;
		System.out.println("Enter your value for a , b and c :");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		
		if(a<b && a<c) {
			System.out.println("Min Result for A :"+a);
		}
		
		else if(b<a && b<c) {
			System.out.println("Min Result for B :"+b);
		}
		
		else {
			System.out.println("Min Result for C ;"+c);
		}
		
		if(a>b && a>c) {
			System.out.println("Max Result for A :"+a);
		}
		
		else if(b>a && b>c) {
			System.out.println("Max  Result for B :"+b);
		}
		
		else {
			System.out.println("Max Result for C :"+c);
		}
	}

}
