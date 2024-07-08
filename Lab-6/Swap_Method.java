import java.util.Scanner;

public class Swap_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number in a : ");
        int a = sc.nextInt();
        System.out.println("Enter Number in b : ");
        int b = sc.nextInt();
        swap(a,b);
    }

    static void swap(int a , int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println("Value of a : "+ a);
        System.out.println("Value of b : "+ b);


    }
}
