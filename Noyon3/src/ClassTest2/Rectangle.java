package ClassTest2;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int h,w,perimeter,area;
		Scanner s=new Scanner(System.in);
		System.out.println("enter hight");
		h=s.nextInt();
		System.out.println("enter width");
		w=s.nextInt();
		
		perimeter=2*(h+w);
		System.out.println("Perimeter="+perimeter);
		area=h*w;
		System.out.println("area="+perimeter);

	}

}
