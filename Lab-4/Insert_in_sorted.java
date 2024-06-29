import java.util.Scanner;

public class Insert_in_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of array:");
        int n = sc.nextInt();

        int []a = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.println("Enter Number : ");
            a[i] = sc.nextInt();
        }

        int []b = new int[n+1];
        System.out.println("Enter a Number You Want to Insert : ");
        int x=sc.nextInt();

        for(int i = 0 ; i<n ; i++){
            b[i] = a[i];
        }
        b[n] = x;

        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n+1 ; j++){
                if(b[i]>b[j]){
                    int temp = b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }

        System.out.println("After Sorting the Array : ");
        for(int i=0 ; i<n+1 ; i++){
            System.out.print(b[i] + " ");
        }

        
        

    }
}
