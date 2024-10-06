package MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Map<String, Integer>obj=new HashMap<>();
		obj.put("Apple", 20);
		obj.put("Orange", 20);
		obj.put("Mango", 40);
		obj.put("Lemon", 30);


		System.out.println(obj.get("Lemon"));
		
		for (Map.Entry<String,Integer> data : obj.entrySet()) {
			System.out.println(data.getKey()+" "+data.getValue());
			
		}
		
		for (String data : obj.keySet()) {
			System.out.println("key:"+data+" "+"value:"+obj.get(data));
			
		}
		for (String data : obj.keySet()) {
			System.out.println(data);
			
		}
		
		for (Integer data : obj.values()) {
			System.out.println(data);
			
		}

		
		
		
		/*
		 * Map<String, Integer>obj3=new LinkedHashMap<>(); HashMap<String,
		 * Integer>obj1=new HashMap<>(); LinkedHashMap<Integer,String>obj2=new
		 * LinkedHashMap<>();
		 */
	}

}
