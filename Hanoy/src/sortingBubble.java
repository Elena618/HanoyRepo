import java.util.Arrays;

public class sortingBubble {
    public static void main(String[] args) {
        int [] arr = {1,4,2,5,6,4,3,2};
        int scan = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if (arr[j] > arr[j-1]) {
                    int buff = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = buff;
                }
                }
            }
        System.out.println("Sorting "+ Arrays.toString(arr));
        }
    }

