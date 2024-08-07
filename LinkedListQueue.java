import java.util.Scanner;

class Queue_Method{


    class Node{
        char info;
        Node link;
        
        Node(char info){
            this.info=info;
            this.link=null;
        }
    }
    public Node FIRST;
    public Node LAST;

    public void PUSH(char data) {
        Node newNode = new Node(data);
        Node SAVE = FIRST;

        if (FIRST == null) {
            FIRST = newNode;
            return;
        }

        while (SAVE.link != null) {
            SAVE = SAVE.link;
        }

        SAVE.link = newNode;
        LAST = newNode;
        return;
    }

    public char POP(){
        char val = FIRST.info;
        if (FIRST == null) {
            System.out.println("List is empty .!");
            return '\0';
        }
        FIRST = FIRST.link;
        return val;

    }


    public void Display(){
        Node SAVE = FIRST;
        if (FIRST == null) {
            System.out.println("Linked List is Empty !");
            return;
        }
        System.out.print("[");
        while (SAVE != null) {
            System.out.print(SAVE.info + " ");

            SAVE = SAVE.link;
        }
        System.out.println("]");

    }

}




public class LinkedListQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue_Method q = new Queue_Method();
        q.PUSH('a');
        q.PUSH('b');
        q.PUSH('c');

        q.Display();

        System.out.println(q.POP());
        System.out.println(q.POP());
        System.out.println(q.POP());

        q.Display();
    }
}
