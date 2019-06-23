public class factorialRec {
    public static void main(String [] args){
        double number = 171;
        System.out.println("Factorial  is " + fact(number));
    }
    public static double fact(double number){
        if(number == 1){
            return 1;
        }
        return number * fact(number -1);
    }
}
