package HasMMapExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHasMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String>obj=new LinkedHashMap<>();
		obj.put(1, "Apple");
		obj.put(2, "Orange");
		obj.put(3, "Grape");
		obj.put(4, "Mango");
		System.out.println(obj);
		obj.clone();
		System.out.println(obj);
		System.out.println(obj.size());
		
		for (Integer st : obj.keySet()) {
			System.out.println("get Key="+st);
			
		}
		for (String st : obj.values()) {
			System.out.println("get Values="+st);
			
		}
	}

}
