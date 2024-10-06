package ExceptionHandling;

public class Class1 {

	public static void main(String[] args) {
		
	//get an error,it is called exception
//		System.out.println(10/0);
		
		int a=5;
//		int b=0;
		int b=2;
		String d="Kamal";
		
//		ArithmeticException
		try {
			double c=a/b;
			System.out.println(c);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		/*
		 * catch(Exception e) { System.out.println(e); }
		 */
		
		
		//NumberFormatException
		try {
		int	num=Integer.parseInt(d);
			System.out.println(num);
		}
		
		catch(NumberFormatException abc) {
			System.out.println(abc);
		}
	}
}
