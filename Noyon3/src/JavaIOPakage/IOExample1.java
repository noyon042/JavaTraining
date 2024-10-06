package JavaIOPakage;

import java.util.Scanner;

public class IOExample1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		
		System.out.print("abc");
		System.out.println("def");
		System.err.println("xyz");
		
		System.out.printf(
				"Formatted with"+" precision:PI=%.2f\n",Math.PI
				);
	}
}
