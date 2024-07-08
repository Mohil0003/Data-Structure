import java.util.Scanner;

class Stack {
    int top = -1;
    int N;
    int[] s;

    public Stack(int N) {
        this.N = N;
        s = new int[N];
    }

    public void push(int p1) {

        if (top >= N - 1) {
            System.out.println("-----------");
            System.out.println("Stack OverFLow ");
            System.out.println("-------------");
            return;
        }
        s[++top] = p1;
        return;

    }

    public int pop() {
        if (top < 0) {
            System.out.println("-----------");
            System.out.println("Stack UnderFlow");
            System.out.println("----------");
            return -1;
        }
        return s[top--];
    }

    public int peep(int i) {
        if (top - i + 1 < 0) {
            System.out.println("------------");
            System.out.println("Stack UnderFLow");
            System.out.println("------------");
            return -1;
        }
        return s[top - i + 1];
    }

    public int change(int i, int x) {

        if (top - 1 + 1 < 0) {
            System.out.println("------------");
            System.out.println("Stack UnderFLow");
            System.out.println("------------");
            return -1;
        }

        s[top - i + 1] = x;
        return s[top - i + 1];
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }
}

public class Methods_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Stack : ");
        int x = sc.nextInt();

        Stack obj = new Stack(x);

        while (true) {

            System.out.println("Enter 1 for push ");
            System.out.println("Enter 2 for pop ");
            System.out.println("Enter 3 for peep ");
            System.out.println("Enter 4 for change ");
            System.out.println("Enter 5 for Display ");
            System.out.println("Enter -1 to Exit ");
            System.out.println("-----------------");
            System.out.println("Choose Option : ");

            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter Value to push :");
                    int p1 = sc.nextInt();
                    obj.push(p1);
                    break;

                case 2:
                    System.out.println(obj.pop());
                    break;

                case 3:
                    System.out.println("Enter Value of ith Element to peep :");
                    int i = sc.nextInt();
                    System.out.println(obj.peep(i));
                    break;

                case 4:
                    System.out.println("Enter Value to be Change :");
                    int x1 = sc.nextInt();
                    System.out.println("Enter ith index to be change :");
                    int i1 = sc.nextInt();
                    obj.change(i1, x1);
                    break;

                case 5:
                    System.out.println("Stack : ");
                    obj.display();
                    break;

                default:
                    System.out.println("Exit.....");
                    return;
            }
        }

    }
}
