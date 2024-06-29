import java.util.*;

public class Smallest_Largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Length");
        int n = sc.nextInt();
        int []a = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.println("Enter Number : ");
            a[i] = sc.nextInt();
        }

        int min=a[0];
        int max=a[0];

        for(int i=0 ; i<n-1 ; i++){
            if(min>a[i+1]){
                min = a[i+1];
            } else if(max < a[i+1]){
                max = a[i+1];
            }
        }

        System.out.println("Largest Number is : " + max);
        System.out.println("Smallest Number is : " + min);
    }
}