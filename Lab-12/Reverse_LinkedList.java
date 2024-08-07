import java.util.Scanner;

class Reverse {

    public static class Node {
        int info;
        Node link;

        public Node (int info){
            this.info = info;
            this.link = null;
        }
    }

    public static Node FIRST;
    public static Node LAST;


    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (FIRST == null) {
            FIRST = newNode;
            return;
        }
        newNode.link = FIRST;
        FIRST = newNode;
    }


    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(FIRST == null){
            FIRST = LAST = newNode;
            return;
        }
        Node SAVE = FIRST;
        while (SAVE.link != null) {
            SAVE = SAVE.link;
        }
        SAVE.link= newNode;
        newNode = LAST;
    }

    public void print(){
        Node SAVE = FIRST;

        while (SAVE != null) {
            System.out.print(SAVE.info + "->");
            SAVE = SAVE.link;
        }
        System.out.print("null");
        System.out.println();

    }

    public void reverseLL(){
        Node prev = null;
        Node curr = FIRST;
        Node next;

        while (curr != null) {
            next = curr.link;
            curr.link = prev;
            prev = curr;
            curr=next;
        }

        FIRST = prev;

    }



}
public class Reverse_LinkedList {
    
    public static void main(String[] args) {
       Reverse r1 = new Reverse();

       
       r1.insertAtFirst(1);
       r1.insertAtLast(2);
       r1.insertAtLast(3);
       r1.insertAtLast(4);
       r1.insertAtLast(5);
       System.out.println("Linked List : ");
       r1.print();


       r1.reverseLL();
       System.out.println("Reverse Linked List : ");
       r1.print();
    }
}
