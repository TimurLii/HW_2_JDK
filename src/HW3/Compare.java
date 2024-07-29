package HW3;


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

        for(int i =0;i < arr.length;i++){
            if(!arr[i].getClass().equals(arr2[i].getClass())){
                return false;
            }
        }
        return true;
    }
}
