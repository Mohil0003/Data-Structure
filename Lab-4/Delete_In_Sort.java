import java.util.Scanner;

public class Delete_In_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of array:");
        int n = sc.nextInt();

        int []a = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.println("Enter Number : ");
            a[i] = sc.nextInt();
        }
        for(int i=0 ; i<n-1 ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        int []b = new int[n-1];
        System.out.println("Enter a Number You Want to Delete : ");
        int x=sc.nextInt();

        
        for(int i = 0 ; i<n ; i++){
            if(a[i]==x){
                continue;
            }else if(a[i]<x){
                b[i]= a[i];
            } else if(a[i]>x){
                b[i-1] = a[i];
            }
        }

        System.out.println("After Sorting the Array : ");
        for(int i=0 ; i<n-1 ; i++){
            System.out.print(b[i] + " ");
        }

        
    }
}
