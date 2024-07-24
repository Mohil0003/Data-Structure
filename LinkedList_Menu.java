// 57. Write a menu driven program to implement following operations on the singly 
// linked list.  
//  Insert a node at the front of the linked list. 
//  Display all nodes. 
//  Delete a first node of the linked list. 
//  Insert a node at the end of the linked list. 
//  Delete a last node of the linked list. 
//  Delete a node from specified position. 







import java.util.Scanner;

class LinkedList_Method {
    public class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    public Node FIRST;
    public Node LAST;


    // METHOD 1 : insert a node at first position
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (FIRST == null) {
            FIRST = newNode;
            return;
        }
        newNode.link = FIRST;
        FIRST = newNode;
    }



    // METHOD 2 : insert a node at last position
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

        // save last node a pochi jase
        SAVE.link = newNode;
        LAST = newNode;
        return;
    }



    // METHOD 3 : insert a node in ordered linked list
    public void insertInOrdered(int data) {
        Node newNode = new Node(data);
        if (FIRST == null || data <= FIRST.info) {
            insertAtFirst(data);
            return;
        }
        Node SAVE = FIRST;
        while (SAVE.link != null) {

            // predessor ni help thi node find karsu ane value madi jaay to if ma jase
            if (SAVE.info <= data && SAVE.link.info >= data) {
                newNode.link = SAVE.link;
                SAVE.link = newNode;
                return;
            }
            SAVE = SAVE.link;
        }

        insertAtLast(data);
    }



    // METHOD 4 : Insert a node at the given Index
    public void insertAtIndex(int idx, int data) {
        if (idx == 0) {
            insertAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node SAVE = FIRST;
        int i = 0; // starting index: 0 || start index:1

        // index find karva loop fervsu
        while (i < idx - 1) {
            SAVE = SAVE.link;
            i++;
        }
        newNode.link = SAVE.link;
        SAVE.link = newNode;
    }



    // METHOD 5 : Delete first node in LINKED LIST
    public void deleteAtFirst(){
        if(FIRST == null){
            System.out.println("Linked List is Empty ! ");
            return;
        }
        if (FIRST == LAST){
            FIRST=LAST=null;
            System.out.println("First Node Deleted Successfully");
            return;
        }
        System.out.println("First Node Deleted Successfully");
        FIRST = FIRST.link;

    }



    // METHOD 6 : Delete Last node in LINKED LIST
    public void deleteAtLast(){
        if(FIRST == null){
            System.out.println("Linked List is Empty ! ");
            return;
        }
        if (FIRST == LAST){
            FIRST=LAST=null;
            System.out.println("Last Node Deleted Successfully");
            return;
        }

        Node SAVE = FIRST;
        Node pred = null;

        while (SAVE.link != null) {
            pred = SAVE;
            SAVE = SAVE.link;
        }
        
        pred.link = null;
        LAST =pred;
        System.out.println("Last Node Deleted Successfully");

    }
    // METHOD 7 : Delete node of given value in LINKED LIST
    public void deleteNode(int key){
        if(FIRST == null){
            System.out.println("Linked List Empty !");
            return;
        }
        if(FIRST.info == key){
            deleteAtFirst();
            return;
        }

        Node SAVE = FIRST;
        Node pred = null;

        while (SAVE != null) {
            
            if(SAVE.info == key){
                pred.link = SAVE.link;
                System.out.println("Node Deleted Successfully !");
                return;
            }
            pred = SAVE;
            SAVE = SAVE.link;
        }
        System.out.println("Your Value Not found in Linked List !");
    }

    // METHOD 8 : Display All Nodes
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

}

public class LinkedList_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList_Method obj = new LinkedList_Method();

        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("Menu List : ");
            System.out.println("1. Insert a node at the first in LINKED LIST");
            System.out.println("2. Insert a node at the Last in LINKED LIST");
            System.out.println("3. Insert a node on order in LINKED LIST");
            System.out.println("4. Insert a node at the given Index");
            System.out.println("5. Delete first node in LINKED LIST");
            System.out.println("6. Delete Last node in LINKED LIST");
            System.out.println("7. Delete node of given value in LINKED LIST");
            System.out.println("8. Display All Nodes ");
            System.out.println("Enter Anything else to Exit");
            System.out.println("Choose Option : ");
            int op = sc.nextInt();
            System.out.println("-----------------------------------");

            switch (op) {
                case 1:
                    System.out.println("Enter Value to Insert at first :");
                    obj.insertAtFirst(sc.nextInt());
                    break;

                case 2:
                    System.out.println("Enter Value to Insert at last :");
                    obj.insertAtLast(sc.nextInt());
                    break;

                case 3:
                    System.out.println("Enter Value to Insert in Order :");
                    obj.insertInOrdered(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter index at which value is to be inserted : ");
                    int idx = sc.nextInt();
                    System.out.print("Enter value to be inserted : ");
                    int data = sc.nextInt();
                    obj.insertAtIndex(idx, data);
                    break;

                case 5:
                    obj.deleteAtFirst();
                    break;

                case 6:
                    obj.deleteAtLast();;
                    break;

                case 7:
                    System.out.println("Enter value want to be delete : ");
                    int key = sc.nextInt();
                    obj.deleteNode(key);
                    break;

                case 8:
                    obj.Display();
                    break;

                default:
                    System.out.println("Exited.........");
                    return;
            }
        }
    }
}
