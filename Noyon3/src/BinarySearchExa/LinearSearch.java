package BinarySearchExa;

import java.util.ArrayList;

public class LinearSearch {

	public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(arr);
        int target=arr.get(4);
        int result=Liner(arr,target);
        if (result == -1) {
            System.out.println("No Element Found");
        }else {
            System.out.println(result);
        }
        
    }
    public static int Liner(ArrayList<Integer> arr, int target) {

        for (int i = 0; i <arr.size() ; i++) {
            if (arr.get(i) == target) {
                return arr.get(i);
            }

        }
        return -1;
    }
}
