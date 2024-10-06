package BinarySearchExa;

public class BinarySearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int []arr={2,3,4,5,6};
	        int target=3;
	        int result=binarySearch(arr,target);
	        if (result == -1) {
	            System.out.println("Element Not Found");
	        }
	        else {
	            System.out.println("Element Found "+result);
	        }
	    }

	    private static int binarySearch(int[] arr, int searchvalue) {
	      int start=0;
	      int end=arr.length-1;
	      while (start<=end){
	          int mid=(start+end)/2;
	          if ( searchvalue>arr[mid]) {
	              start=mid+1;
	          }else if (searchvalue<arr[mid]){
	              end=mid-1;
	          }else {
	              return arr[mid];
	          }
	      }
	        return -1;
	}

}
