public class binarySerch {
    public static void main(String[] args){
    //int [] arr1 = new int[10];
    int [] arr1 = {2,3,4,5,8,3,22,11,2,5};//sorting array
    int index = binSearch(arr1, 1);
        System.out.println("Index is "+index);
    }
    public static int binSearch(int [] arr1, int item){
        int low = 0;
        int high = arr1.length - 1;

        while(low <= high){
            int mid = (low + high)/2;
            int guess = arr1[mid];
            if(guess < item){
                low = mid + 1;
            }else if(guess > item){
                high = mid - 1;
            }else if(guess == item){
                return mid;
            }


        }
        return -1;//
    }
}
