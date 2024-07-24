// 59. WAP to check whether 2 singly linked lists are same or not.



import java.util.Scanner;
class LL_Same{
    public class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
            size++;
        }
    }

    public Node FIRST;
    public int size=0;

    public void insertAtLast(int data) {
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



    public void Display(){
        Node SAVE = FIRST;
        if (FIRST == null) {
            System.out.println("Linked List is Empty !");
            return;
        }

        while (SAVE != null) {
            System.out.print(SAVE.info + "->");

            SAVE = SAVE.link;
        }

        System.out.print("null");
        System.out.println();
    }

    public int nthElement( int idx){
        Node SAVE = FIRST;
        for (int i = 0; i < idx; i++) {
            SAVE = SAVE.link;
        }
        return SAVE.info;
    }


    public boolean isSame(LL_Same ll1, LL_Same ll2){
        for (int i = 0; i < size; i++) {
            if (ll1.nthElement(i) != ll2.nthElement(i)) {
                return false;
            }
        }

        return true;
    }


}
public class LinkedList_Same {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LL_Same ll1 = new LL_Same();
        LL_Same ll2 = new LL_Same();

        for (int i = 1; i <= 10; i++) {
            ll1.insertAtLast(i);
        }
        for (int i = 1; i <= 10; i++) {
            ll2.insertAtLast(i);
        }

        System.out.println("Printing the Singly linked list 1 : ");
        ll2.Display();
        System.out.println();
        System.out.println("Printing the Singly linked list 2 : ");
        ll2.Display();


        if (ll1.isSame(ll1, ll2)) {
            System.out.println("Both lists are same.");
        } else {
            System.out.println("Both lists are not same.");
        }
    }
}
