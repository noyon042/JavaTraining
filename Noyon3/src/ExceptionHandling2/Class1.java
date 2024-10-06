package ExceptionHandling2;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int []a= {1,2,3,4,5};
			System.out.println(a[4]);
//			**wanted for exception
//			System.out.println(a[6]);
		}

		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("ADDIE");
		}
		
		try {
			int a=10;
			int b=0;
			System.out.println(a/b);
		}
		catch(ArithmeticException ar) {
			System.out.println(ar);
		}
	}

}
