package LocalInner;

public class LocalInnerClass {

	void display() {
		
		class Inner{
			int a=10;
			int b=20;
			int multi=a*b;
		}
		
		Inner obj=new Inner();
		System.out.println(obj.multi);
	}
}
