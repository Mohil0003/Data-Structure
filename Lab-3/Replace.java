import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.println("Enter Element");
            arr[i] = sc.nextInt();
        }

        System.out.println(" Enter Number you want replace");
        int a = sc.nextInt();
        System.out.println("Enter Number which we want to add ");
        int b = sc.nextInt();

        for(int i=0 ; i<n ; i++){
            if(arr[i]==a){
                arr[i]=b;
                System.out.println("Its Index is : " + i);
            }
        }
        System.out.println("---------------------------");
        System.out.println("After Replacing the Array is :");
        for(int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }

    }
}
