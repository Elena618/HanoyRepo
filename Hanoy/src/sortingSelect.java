import java.util.Arrays;

public class sortingSelect {
    public static void main(String[] args){
        int[] arr1 ={1,3,4,7,3,2,1,4};
        int [] sortArr = new int[8];
        sortArr = selectSort(arr1);
        System.out.println(Arrays.toString(sortArr));
    }
    public static int[] selectSort(int[] arr) {
        int scan = 0;
        for (int index = 0; index < arr.length-1; index++) {
            int min = index;
            for(scan = index +1; scan < arr.length; scan++){
                if(arr[scan] < arr[min]){
                    min = scan;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
}
