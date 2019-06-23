public class Fibbonachi {
    public static void main(String[] args) {
        System.out.println("Fibonachi is " + getFib(2));
    }
    public static int getFib(int value){
        if(value == 0){
            return 0;
        }else if(value == 1){
            return 1;
        }else{
            return getFib(value - 1)+getFib(value - 2);
        }
    }
}
