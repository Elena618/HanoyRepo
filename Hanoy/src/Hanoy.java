import java.util.Stack;

public class Hanoy {
    public static void main(String[] args){
        Stack<Integer> from = new Stack<>();
        Stack<Integer> help = new Stack<>();
        Stack<Integer> to = new Stack<>();
        from.push(8);
        from.push(7);
        from.push(6);
        from.push(5);
        from.push(4);
        from.push(3);
        from.push(2);
        from.push(1);

        System.out.println(from);
        exchange(from, help, to, from.size());
        System.out.println(to);
    }

    public static void exchange(Stack<Integer> from, Stack<Integer> help, Stack<Integer> to, int count) {
        if (count > 0){
            exchange(from, to, help, count-1);
            int biggest = from.pop();
            to.push(biggest);
            exchange(help,from,to,count-1);
        }
    }
}
