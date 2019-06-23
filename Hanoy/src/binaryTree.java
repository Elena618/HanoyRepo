public class binaryTree {
    private Tree root;

    public binaryTree(){
        root = null;
    }
    public Tree find(int k){
        Tree current = root;

        while(current.data != k){
            if(k < current.data){
                current = current.leftChild;
            }else{
                current = current.rightChild;
            }
            if(current == null){
                return null;
            }
        }
        return current;
    }
    public void insert(int val){
        Tree node = new Tree();
        node.data = val;
        if (root == null){
            root = node;
        }else{
            Tree current = node;
            Tree parent;
            while(true){
                parent = current;
                if (val < current.data){
                    current = current.leftChild;
                    if (current == null){
                        parent.leftChild = node;
                        return;
                    }
                }else{
                    current = current.rightChild;
                    if (current == null){
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }


    }
    //public Tree delete(){

    //}

}
