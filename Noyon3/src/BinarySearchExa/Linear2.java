package BinarySearchExa;

import java.util.ArrayList;

public class Linear2 {

		   public static void main(String[] args) {
		       int arr[]={1,2,3,4,5,6,7};
		       int target=5;
		       int result=Liner(arr,target);
		        if (result == -1) {
		            System.out.println("No Element Found");
		        }else {
		            System.out.println(result);
		        }
		    }

		    public static int Liner(int[] arr, int target) {

		        for (int i = 0; i <arr.length ; i++) {
		            System.out.println("hi");
		            if (arr[i] == target) {
		                return arr[i];
		            }

		        }
		        return -1;
	}

}
