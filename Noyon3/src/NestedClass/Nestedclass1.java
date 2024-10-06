package NestedClass;

public class Nestedclass1 {
	/*
	 * static int a=3;
	 * 
	 * int b=5; static int c=3;
	 * 
	 * static int calculate(int a,int b) { return a+b; }
	 * 
	 * static class InnerClass1{ int cal=Nestedclass1.calculate(18,23); Nestedclass1
	 * obj=new Nestedclass1(); int y=obj.b+c; }
	 */
	
	
	
	
	 int i=1;
	 int j=100;
	
	
	 
	 class InnerClass1{
		 int odd=0;
		 int even=0;
		void calculate() {
			for(int m =i;m<=j;m++) {	
			
			if (m%2==0) {
				even=even+m;
			}
			else {
				odd=odd+m;
			}
			}
			
			System.out.println("Even number sum="+even);
			System.out.println("Odd number sum="+odd);
		}
	 }
}







