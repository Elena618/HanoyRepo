public class sumRec {
    public static void main(String [] args){
        int[] A = { 3, 12, 10, 11 };
        int sum;
        sum = sumR(0,A); // sum = 36
        System.out.println(sum);
    }
    public static int sumR(int i, int [] arr){
            if (i==(arr.length-1))
                return arr[i];
            return arr[i] + sumR(i+1,arr);
        }
    }

