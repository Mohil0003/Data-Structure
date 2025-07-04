// 72. Write a menu driven program to implement following operations on the doubly 
// linked list. 
//  Insert a node at the front of the linked list. 
//  Delete a node from specified position. 
//  Insert a node at the end of the linked list. 
//  Display all nodes. 





import java.util.Scanner;

class DLL_Methods{
    class Node {
        int info;
        Node lptr;
        Node rptr;

        public Node(int info){
            this.info = info;
            this.lptr = null;
            this.rptr = null;
        }

    }

    public static Node L;
    public static Node R;

    // Insert a node at the front of the linked list. 
    public void insertAtFirst_DLL(int data){
        Node newNode = new Node(data);

        if(L == null){
            L = newNode;
            R = newNode;
            return;
        }

        newNode.rptr = L;
        L.lptr = newNode;
        L = newNode;


    }

    //  Insert a node at the end of the linked list.
    public void insertAtLast_DLL(int data){
        Node newNode = new Node(data);

        if(L == null){
            L = newNode;
            R = newNode;
            return;
        }

        R.rptr = newNode;
        newNode.lptr = R;
        R = newNode;

    }


    //  Delete a node from specified position. 
    public void deleteAtPosition(int key){
    
       if (L == null){
        System.out.println("LL is Empty  !!!");
        return;
       }

       if(key == 0){
        System.out.println("Postion of Node always Started with 1");
        return;
       }

       Node SAVE = L;
       int pos = key;
       
       for(int i=1 ; i<pos ; i++){
        SAVE = SAVE.rptr;    
       }

       if (SAVE == L){
        L = SAVE.rptr;
       } 
       else if (SAVE == R){
        SAVE.lptr.rptr = null;
        SAVE = null;
        return;
       }
       else if (SAVE == null){
        System.out.println("You Entered value is greater than of Size of LL ");
       }
       else {
        SAVE.lptr.rptr = SAVE.rptr;
        SAVE.rptr.lptr = SAVE.lptr;
       }

       SAVE = null;

    }


    //  Display all nodes.
    public void Display(){
        Node SAVE = L;
        
        while (SAVE != null) {
            System.out.print(SAVE.info + " ");
            SAVE = SAVE.rptr;
        }
    }
}




public class Doubly_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL_Methods obj = new DLL_Methods();
        obj.insertAtFirst_DLL(1);
        obj.insertAtLast_DLL(2);
        obj.insertAtLast_DLL(3);
        obj.insertAtLast_DLL(4);
        //1-2-3-4
        obj.Display();
        System.out.println();
        obj.deleteAtPosition(3);
        //1-2-4

        System.out.println("After deleted : ");
        obj.Display();
    }
}
