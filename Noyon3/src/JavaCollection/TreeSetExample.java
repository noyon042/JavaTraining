package JavaCollection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer>obj=new TreeSet<>();
		obj.add(80);
		obj.add(30);
		obj.add(10);
		obj.add(20);
		obj.add(1);
		obj.add(2);
		obj.add(70);
		obj.add(50);

		System.out.println("Tree Set"+obj);
		
		TreeSet<String>obj1=new TreeSet<>();
		obj1.add("Tomato");
		obj1.add("Onion");
		obj1.add("Potato");
		obj1.add("Apple");
		//obj1.add(null);
		System.out.println("Tree Set"+obj1);
		System.out.println("First value="+obj.first());
		System.out.println("Last value="+obj.last());
		System.out.println("Higher value in 10 ="+obj.higher(10));
		System.out.println("Lower value in 10 ="+obj.lower(10));



	}

}
