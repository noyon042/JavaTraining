package ClassTest2;

public class MathOperation {

		public static void main(String[] args) {
			MathOperation obj = new MathOperation();
			System.out.println("Addition of two number :" +obj.operation(5,7));
			System.out.println("Substraction of two number :" +obj.operation(1.0f,3.0f));
			System.out.println("Multiplication of two number :" +obj.operation(4.0,5.0));
			System.out.println("Division of two number :" +obj.operation(20,5.0f));
			System.out.println("Concatation of two string :" +obj.operation("Noyon"," Mahmud Taj"));
		}
		int operation(int a, int b){
			return a+b;
		}
		float operation(float a, float b){
			return a-b;
		}
		double operation(double a, double b){
			return a*b;
		}
		float operation(int a, float b){
			return a/b;
		}
		String operation(String a, String b){
			return a+b;
		}

	}


