package Class3;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int a,b,c,sum;
	double avg;
		
	Scanner obj=new Scanner(System.in);
		System.out.println("enter three value");
		
		
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		
		sum=a+b+c;
		System.out.println("Sum of three value="+sum);
		
		avg=sum/3f;
		System.out.println("Average of three value="+avg);

	}

}
