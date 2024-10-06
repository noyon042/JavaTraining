package JavaCollection;

import java.util.HashSet;
import java.util.Iterator;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       HashSet<String>obj=new HashSet<>();
		
		//data insert
		obj.add("Carrot");
		obj.add("Potato");
		obj.add("Tomato");
		obj.add("Onion");
		obj.add("Jingal");
		
		//data retrieve
		System.out.println(obj);
		if(obj.contains("Carrot")) {
			System.out.println("this vegetables already enrolled");
		}else {
			System.out.println("this vegetables are not enrolled");
		}
		
		obj.add("Green chili");
		
		Iterator<String>it=obj.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
