import java.sql.SQLOutput;

public class listNode {
    Node first;

    public listNode(){
        first = null;
    }
    public int getCount(Node first){
        int count = 0;
        while(first.next != null){
            count++;
        }
        return  count;
    }
    public int getCountR() {
        int count = 0;
            return count;
    }
    public void addNode(int num) {
        Node node = new Node(num);
        node.next = first;
        first = node;
    }
    public void printNode() {
        Node currentNode = first;
        if (currentNode == null) {
            System.out.println("List is null");
        }
        while (currentNode != null) {
            System.out.println("List is " + currentNode.num + currentNode.next);
            currentNode = currentNode.next;
        }
    }
    public void toCycle() {
        Node currentNode = first;
        Node buf = first;
        while (true) {
            if (currentNode.next == null) {
                currentNode.next = buf;
                break;
            }
            currentNode = currentNode.next;
        }

    }
    public boolean isCyrcle(){
        Node check = first.next;
        boolean cancel = false;
        while(!cancel && first!=check){
            System.out.println("List is "+ check.num);
            check = check.next;
            if(check.next == null){
                cancel = true;
                System.out.println("List is not cyrcle");
                return false;
            }
            if (first == check){
                System.out.println("the list is cyrcle");
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        listNode list = new listNode();
        list.addNode(2);
        list.addNode(3);
        list.addNode(5);
        list.toCycle();
        list.isCyrcle();

        }
    }


/*
class NodeList{
    private Node first;
}
*/