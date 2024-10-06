package HasMMapExample;

import java.util.HashMap;

public class HasMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer>obj=new HashMap<>();
		//Map<String, Integer>obj1=new HashMap<>();
		
		obj.put("Rakibul", 40);
		obj.put("Noyon", 24);
		obj.put("Hasan", 34);
		obj.put("Amirul", 45);
		obj.put("Hasan", 54);
		obj.put("Murad", 4);
		obj.put(null, 34);
		obj.put(null, null);
		obj.put(null, null);



		System.out.println(obj);

		obj.remove("Amirul");
		System.out.println("After Remove="+obj);
		System.out.println("Get Value="+obj.get("Noyon"));
		obj.replace("Rakibul", 100);
		System.out.println("Replace Value="+obj);
		
		for (HashMap.Entry<String, Integer> data : obj.entrySet()) {
			System.out.println(data.getKey()+" "+data.getValue());
			
		}
		
		HashMap<String, Integer>obj1=new HashMap<>();
		obj1.put("Rahim", 12);
		obj1.putAll(obj);
		System.out.println(obj1);
	}

}
