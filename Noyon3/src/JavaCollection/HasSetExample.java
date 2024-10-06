package JavaCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//creation
		HashSet<String>obj=new HashSet<>();
		
		//data insert
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Lemon");
		obj.add("Mango");
		obj.add("Jack Fruit");
		
		//data retrieve
		System.out.println(obj);
		
		obj.remove("Mango");
		//data retrieve after remove
		System.out.println("data retrieve after remove="+obj);
		System.out.println("set size="+obj.size());
		System.out.println("contains method="+obj.contains("Lemon"));
		
//		obj.clear();
//		System.out.println("data clear after set="+obj);
		System.out.println("use is Empty Method="+obj.isEmpty());
		
		//use iterator
		Iterator<String>it=obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		for (String st : obj) {
			System.out.println(st);
		}
		
		
//		int i=0;
//		while(i<=5) {
//			System.out.println(i);
//			i++;
//		}
		
		
	}

}
