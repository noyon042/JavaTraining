package ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>obj=Arrays.asList(5,4,3,2,1);
		System.out.println(obj);
		
		Collections.sort(obj);
		System.out.println(obj);
		Collections.reverse(obj);
		System.out.println(obj);
	
	}

}
