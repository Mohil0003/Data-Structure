import java.util.*;

public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter location");
        int x = sc.nextInt();
    
        System.out.println("Enter Length");
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.println("Enter number");
            a[i] = sc.nextInt();
        }

        int [] b = new int[n-1];

        for(int i = 0 ; i<n ; i++){
            if(i==x){
                continue;
            }else if(i<x){
                b[i]= a[i];
            } else if(i>x){
                b[i-1] = a[i];
            }
        }
        System.out.println("-------------------");
        for(int i=0 ; i<n-1; i++){

            System.out.println(b[i]);
        }
    }
}


