package Overloading;

public class Subclass {

	public int calculate(int a,int b,int c) {
		return a+b+c;
	}
	
	public int calculate(int a,int b) {
		return a*b;
	}
	public int calculate(int a) {
		return a-5;
	}
}
