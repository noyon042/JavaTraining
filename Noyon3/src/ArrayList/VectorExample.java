package ArrayList;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String>obj=new Vector<>();
		obj.add("Orange");
		obj.add("Apple");
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.add("Lemon"));
		System.out.println(obj);
		obj.clear();
		System.out.println(obj.isEmpty());


	}

}
