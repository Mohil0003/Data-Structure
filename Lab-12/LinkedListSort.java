/*
 * 65. Write a program to sort elements of a linked list.
 */

 public class LinkedListSort {

    public static class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    public Node FIRST;

    public void insertAtLast(int info) {
        Node newNode = new Node(info);
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

    public void Display() {
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

    private Node getMid(Node FIRST) {
        Node slow = FIRST;
        Node fast = FIRST.link;

        while (fast != null && fast.link != null) {
            slow = slow.link;
            fast = fast.link.link;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.info <= head2.info) {
                temp.link = head1;
                head1 = head1.link;
                temp = temp.link;
            } else {
                temp.link = head2;
                head2 = head2.link;
                temp = temp.link;
            }
        }
        while (head1 != null) {
            temp.link = head1;
            head1 = head1.link;
            temp = temp.link;
        }
        while (head2 != null) {
            temp.link = head2;
            head2 = head2.link;
            temp = temp.link;
        }
        return mergedLL.link;
    }

    public Node mergeSort(Node FIRST) {
        if (FIRST == null || FIRST.link == null) {
            return FIRST;
        }
        Node mid = getMid(FIRST);
        Node rightHead = mid.link;
        mid.link = null;
        Node newLeft = mergeSort(FIRST);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        LinkedListSort li = new LinkedListSort();
        li.insertAtLast(4);
        li.insertAtLast(3);
        li.insertAtLast(2);
        li.insertAtLast(1);

        System.out.println("Before sort :");
        li.Display();

        li.FIRST = li.mergeSort(li.FIRST);

        System.out.println("After sort : ");
        li.Display();

    }
}