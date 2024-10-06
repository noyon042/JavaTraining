package FilePathCreate;

import java.util.ArrayList;
import java.util.List;


public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         //List:
		
	List<String> list=new ArrayList<>();
		list.add("Kamal");
		list.add("jamal");
		list.add("Rahim");

		list.add(0,"Nabil");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println(list.remove(1));
		System.out.println(list);
		list.set(2,"Nahid");
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
		for (String li:list) {
			
			System.out.println(li);
		}
		
//		for(int i=0;i<list.size;)


       //ArrayList:
		
		ArrayList<String> li=new ArrayList<String>();
		li.add("Kalam");
		li.add("Ksd");
		li.add("lion");
		System.out.println(li);
	
		ArrayList<Integer> li1=new ArrayList<Integer>();

	}

}
