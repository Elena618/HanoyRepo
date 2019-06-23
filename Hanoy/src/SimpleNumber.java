public class SimpleNumber {
    public static void main(String[] args) {

        for(int i =2; i<= 200; i++){
            //int num = i;
            int isDev=0;
            for(int j = i; j >= 1; j--){
                if(i % j==0){
                    isDev++;
                }
            }
            if(isDev == 2) {
                System.out.println("simple number is" + i);
            }
        }
    }
}
