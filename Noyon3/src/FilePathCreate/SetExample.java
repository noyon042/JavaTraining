package FilePathCreate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer>obj=new HashSet<>();
//		HashSet<String>obj1=new HashSet<String>();
		
		obj.add(1);
		obj.add(2);
		obj.add(3);

		System.out.println(obj);
		System.out.println(obj.contains(3));
		System.out.println(obj.isEmpty());
		System.out.println(obj.remove(2));
		

		Set<Integer>obj2=new HashSet<>();
		obj2.add(1);
		obj2.add(4);
		boolean result=obj.equals(obj2);
		System.out.println(result);
		
		for (Integer data : obj) {
			System.out.println(data);
		}
		
		
		

		
		HashSet<Integer>obj1=new HashSet<Integer>();
		obj1.add(1);
		obj1.add(2);
		obj.add(2);//Set can not allow duplicate value but list can allow
		System.out.println(obj1);
	}

}
