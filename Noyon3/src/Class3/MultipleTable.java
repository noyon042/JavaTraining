package Class3;

import java.util.Scanner;

public class MultipleTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int i,n,num;
		
		
		Scanner obj=new Scanner(System.in);
			System.out.println("enter the number");
			n=obj.nextInt();
			
			for(i=1;i<=10;i++) {
				num=n*1;
				System.out.println(n+"*"+i+"="+num);
			}
			
	}

}
