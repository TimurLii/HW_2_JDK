package HW3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Compare {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        Integer []arr2 = {1,2,3,4,5};
        String [] arr3 = {"A","b","C"};
        String [] arr4 = {"A","b","C"};
        System.out.println(compareArrays(arr1,arr2));
        System.out.println(compareArrays(arr3,arr4));


    }
    private  static <T >boolean compareArrays(T  []arr, T []arr2){
        if(arr.length != arr2.length) return false;
//        return Arrays.equals(arr,arr2);
        for(int i =0;i < arr.length;i++){
            if(!arr[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }
}
