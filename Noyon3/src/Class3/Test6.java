package Class3;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a;
	
			
		Scanner obj=new Scanner(System.in);
			System.out.println("enter One value");
			
			
			a=obj.nextInt();
			
			if(a%2==0) {
				System.out.println(a+"=Even number");
			}
			else {
				System.out.println(a+"=Odd number");
			}

	}

}
