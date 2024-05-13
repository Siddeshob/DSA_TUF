package TreeTUF;

class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int key)
        {
            this.data=key;
        }
    }

public class NodeRepresentation {
        public static void main(String[] args) {

        Node root=new Node(0);
        root.left=new Node(1);
        root.right=new Node(2);
        
    }
    
}
