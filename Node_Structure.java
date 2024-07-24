// 56. Write a program to implement a node structure for singly linked list. Read the 
// data in a node, print the node.




class Node {
    int info;
    Node link;

    public Node (int info){
        this.info = info;
        this.link = null;
    }
}


public class Node_Structure {
    
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        n1.link=n2;
    }
}
