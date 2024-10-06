package HasMMapExample;

import java.util.HashMap;

public class NewHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer>obj=new HashMap<>();
		
		
		obj.put("Rakibul", 40);
		obj.put("Noyon", 24);
		obj.put("Hasan", 34);
		obj.put("Amirul", 45);
		obj.put("Taj", 54);
		System.out.println(obj);
		System.out.println("Get Value of Rakibul="+obj.get("Rakibul"));
		
		if (obj.containsKey("Hasan")) {
			System.out.println("Key is present");
		}
		else {
			System.out.println("Key is not present");
		}
		
		
		System.out.println("Check Contains Amirul="+obj.containsKey("Amirul"));
		obj.replace("Taj", 45);
		System.out.println("Replace Value="+obj);
		
		for (HashMap.Entry<String, Integer> data : obj.entrySet()) {
			System.out.println(data.getKey()+" "+data.getValue());
			
		}
	}

}
