import java.util.Scanner;
class AlterNode_Delete{
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

    public void Alter_Delete(){
        Node SAVE = L;
        int temp = 1;

        while (SAVE != null) {

            if(temp%2 ==0){
            SAVE.lptr.rptr = SAVE.rptr;
            SAVE.rptr.lptr = SAVE.lptr;
            }
            SAVE = SAVE.rptr;
            temp++;
        }
    }

    public void Display(){
        Node SAVE = L;
        
        while (SAVE != null) {
            System.out.print(SAVE.info + " ");
            SAVE = SAVE.rptr;
        }
    }
}
public class DeleteAlterNode_DLL {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        AlterNode_Delete obj = new AlterNode_Delete();

        obj.insertAtFirst_DLL(1);
        obj.insertAtLast_DLL(2);
        obj.insertAtLast_DLL(3);
        obj.insertAtLast_DLL(4);

        obj.Display(); 

        obj.Alter_Delete();

        //obj.Display();

    }
}
