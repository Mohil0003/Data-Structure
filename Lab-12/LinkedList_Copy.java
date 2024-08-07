import java.util.Scanner;

 class Copy_List{
    public class Node {
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }




    public Node FIRST;

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

    public void Copy(Copy_List obj1 , Copy_List obj2){

        if(obj1.FIRST == null){
            System.out.println("Linked List Empty ! ");
            return;
        }
        Node SAVE = obj1.FIRST;
        while (SAVE != null) {
            obj2.insertAtLast(SAVE.info);
            SAVE = SAVE.link;
        } 
    }

    public void printList() {
        if (FIRST == null) {
            System.out.println("Linkend list is empty .!");
            return;
        }
        Node SAVE = FIRST;
        while (SAVE != null) {
            System.out.print(SAVE.info + " ");
            SAVE = SAVE.link;
        }
        System.out.println();
    }
}
public class LinkedList_Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            Copy_List obj1 = new Copy_List();
            Copy_List obj2 = new Copy_List();

            System.out.println("Enter Size of Linked List :");
            int x = sc.nextInt();
            
        for (int i = 1; i <= x; i++) {
            System.out.println("Enter Value to Insert : ");
            int data = sc.nextInt();
            obj1.insertAtLast(data);
        }

        obj2.Copy(obj1, obj2);

        System.out.println("Linked List 1 :");
        obj1.printList();
        System.out.println("Linked List 2 (Copied) :");
        obj2.printList();

    }
}
