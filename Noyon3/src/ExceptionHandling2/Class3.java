package ExceptionHandling2;
import java.util.Scanner;
public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		System.out.println("Enter your value for a , b and c :");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		

		try {
			int d=a+b;
			
			System.out.println("Sum value of A & B="+d);
			
			int x=d%c;
			System.out.println("Modulas="+x);

			
			try {
				System.out.println(a/x);
			}
			catch(ArithmeticException ar) {
				System.out.println("First Block Execute But Second Block Fail "+ar);
			}
		}
			catch(ArithmeticException e) {
				System.out.println("First Block Fail in try loop 12"+e);
			}
		finally {
			System.out.println("Welcome to ADDIE");
		}
	}

}
