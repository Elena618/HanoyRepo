import java.util.Arrays;

public class deleteNum {
    public static void main(String[] args) {
        int array []={1,2,3,4,5,3,2,1,2};
        int val = 3;
        int offset = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == val){
                offset++;
            }else{
                array[i-offset] = array[i];
            }
        }

        int newArray [] = new int[array.length - offset];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = array[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
