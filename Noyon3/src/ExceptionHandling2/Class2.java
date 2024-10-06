package ExceptionHandling2;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Nested try loop
		
		try {
			int a=10;
			int b=2;
			int c=a%b;
			System.out.println(c);
			
			try {
				System.out.println(a/c);
				
				
				String m=null;
				System.out.println(m.toLowerCase(null));
				
				String n="Noyon";
				int p=Integer.parseInt(n);
				System.out.println(p);
				
			}
			catch(ArithmeticException ar) {
				System.out.println("First Block Execute But Second Block Fail"+ar);
			}
			catch(NullPointerException are) {
				System.out.println(are);
			}
			catch(NumberFormatException num) {
				System.out.println(num);
			}
	
		}
		
		
			catch(ArithmeticException e) {
				System.out.println("First Block Fail"+e);
			}
		}
	}


