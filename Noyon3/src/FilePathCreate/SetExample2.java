package FilePathCreate;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer>obj=new HashSet<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		
		for (Integer data : obj) 
		{
			System.out.println(data);
		}
		
		
		
		HashSet<Integer>obj2=new HashSet<>();
		obj2.add(1);
		obj2.add(4);
		obj2.add(5);
		
		boolean result=obj.equals(obj2);
		System.out.println(result);
	}

}
