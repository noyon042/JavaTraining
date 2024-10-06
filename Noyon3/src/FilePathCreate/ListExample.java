package FilePathCreate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list=new ArrayList<>();
		
		List<String>list2=Arrays.asList("Ant","Cat","Tiger");
		
		list.add("Kamal");
		list.add("jamal");
		list.add("Rahim");		
		list.add("Noyon");
		list.add("Ridoy");
		
		list.addAll(list2);
		System.out.println("Contains value: "+list.contains("Rahim"));

	    System.out.println(list);
		list.set(4,"Taj");
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println("List of Index: "+list.indexOf("jamal"));

		
	
		
	for (String li:list) {
			
			System.out.println(li);
		}
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
		
	}

		
	}

}
