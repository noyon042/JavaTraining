package LocalInnerClass;

import java.util.Scanner;


public class NewClass {


	void display() {
		System.out.println("Enter your value=");
		
		class Inner{
			int a=1;
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int result =(n*(n+a))/2;
			
		}
		Inner obj=new Inner();
		System.out.println(obj.result);
		
		
	}
}
