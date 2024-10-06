package ArrayList;

import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(1);
		obj.add(2);
		obj.addFirst(5);
		obj.addLast(6);
		System.out.println(obj);
		System.out.println(obj.get(1));
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		
		for (Integer list : obj) {
			
			System.out.println(list);
		}


	}

}
