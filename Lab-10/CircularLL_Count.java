// 58. Write a program to count the number of nodes in a singly circularly linked list.



import java.util.Scanner;
class CLL_Count{
    public class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = FIRST;
            count++;
        }
    }

    public Node FIRST;
    public static int count;



    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        Node SAVE = FIRST;

        if (FIRST == null) {
            FIRST = newNode;
            newNode.link = FIRST;  
            return;
        }

        while (SAVE.link != FIRST) {
            SAVE = SAVE.link;
        }

        // save last node a pochi jase
        SAVE.link = newNode;
        return;
    }

    public void Display(){
        
        if (FIRST == null) {
            System.out.println("Linked List is Empty !");
            return;
        }
        Node SAVE = FIRST;
        while (SAVE.link != FIRST ) {
            System.out.print(SAVE.info + "->");

            SAVE = SAVE.link;
        }

        System.out.print(SAVE.info + " ");
        System.out.println();
    }

}
public class CircularLL_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CLL_Count cll = new CLL_Count();


        for(int i = 1 ; i<=10 ; i++){
            cll.insertAtLast(i);
        }

        System.out.println("Singly Circular Linke List : ");
        cll.Display();

       System.out.println("Number of Nodes In Circular Linked List is : " + cll.count);
    }
}
