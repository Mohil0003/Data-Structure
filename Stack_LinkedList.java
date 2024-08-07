// 60. Write a program to implement stack using singly linked list.




import java.util.Scanner;

class Stack_Methods{
    class Node{
        int info;
        Node link;

        public Node (int info){
            this.info = info;
            this.link = null;
        }

    }
    public Node FIRST;

    public void push(int data) {
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

        return;
    }

    public void pop() {
        if (FIRST == null) {
            System.out.println("List is empty .!");
            return;
        }
        if(FIRST.link==null)
        {
            FIRST=null;
            System.out.println("ELement Deleted and Stack Empty");
            return;
        }
        Node SAVE = FIRST, prev = null;
        while (SAVE.link != null) {
            prev = SAVE;
            SAVE = SAVE.link;
        }
        prev.link = null;
        System.out.println("Last Element deleted successfully.");
    }


    public void Display(){
        Node SAVE = FIRST;
        if (FIRST == null) {
            System.out.println("Linked List is Empty !");
            return;
        }
        System.out.print("[ ");
        while (SAVE != null) {
            System.out.print(SAVE.info + ",");

            SAVE = SAVE.link;
        }
        System.out.print(" ]");
        System.out.println();
        return;
    }

}






public class Stack_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack_Methods SM = new Stack_Methods();

        while(true){

            System.out.println("----------------------------------");
            System.out.println("press 1 for Push");
            System.out.println("Press 2 for Pop");
            System.out.println("Press 3 for Stack Display");
            System.out.println("press any for exit");
            System.out.println("Choose One Option of Them : ");


            int n = sc.nextInt();

            switch (n) {
                case 1:
                System.out.print("Enter value to be insert : ");
                SM.push(sc.nextInt());
                    break;

                case 2:
                    SM.pop();
                        break;

                case 3:
                SM.Display();
                break;
            
                default:
                    System.out.println("Exited.........");
                    return;
            }
        }

    }
}
