package BinarySearchExa;

import java.util.ArrayList;

public class BinarySearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int [] arr= {1,2,3,4,5,6,12,24,34,26};
		
		ArrayList<Integer>obj=new ArrayList<>();
		
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(6);
		obj.add(10);
		obj.add(12);
		obj.add(22);
		obj.add(14);
		obj.add(18);
		obj.add(36);
		
		
		int target=obj.get(3);
		int result=binarySearch(obj,target);
		
		if (result==-1) {
			System.out.println("Element not found in the array");
			
		}
		else {
			System.out.println("Element Found="+result);
		}
		
	}
	
	public static int binarySearch(ArrayList<Integer>arr,int searchValue) {
		
		int start=0;
		int end=arr.size()-1;
		
		 while(start<=end) {
			 
			 int mid=(start+end)/2;
			 
			 if (searchValue>arr.get(mid)) {
				 start=mid+1;
				
			}
			 else if (searchValue<arr.get(mid)) {
				end=mid-1;
			}
			
			 else {
				return arr.get(mid);
			}
		 }
		return -1;
	}

}
