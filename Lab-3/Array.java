import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array");
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0 ; i<n ; i++){
            System.out.println("Enter Number");
            a[i]=sc.nextInt();
        }

        System.out.println("--------------------------");

        for(int i=0 ; i<n ; i++){
            System.out.println(a[i]);
        }
    }
}
