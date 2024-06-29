import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array : ");
        int n = sc.nextInt();

        int []a = new int[n];
        for(int i=0 ; i<n ; i++){
            a[i]= sc.nextInt();
        }

        int length = duplicate(a,n);

        System.out.println("After Deleted Duplicate");
        for(int i=0 ; i<length ; i++){
            System.out.println(a[i]);
        }

    }

    static int duplicate(int a[] , int n){
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (a[i] != a[i+1]){  
                temp[j++] = a[i];  
            }  
         }  
        temp[j++] = a[n-1];     
        
        
        for (int i=0; i<j; i++){  
            a[i] = temp[i];  
        }  
        return j;  
    }  
    
}
