// Binary Search of Arrays (Iterative Approach)



import java.util.Scanner;

public class Iterative_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println(" NOTE : Enter Sorted Array ! ");


        for(int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Searching Number : ");
        int key = sc.nextInt();

        int left = 0;
        int right = n-1;
        
        while (left <= right) {

            int middle = (left + right)/2;

            if(a[middle] == key){
                System.out.println("Number Found at index : " + middle);
                return;
            }
            else if(key < a[middle]){
                right = middle-1;
            }
            else if(key > a[middle]){
                left = middle+1;
            }
        }

        System.out.println("Number Not Found ");
        return;
    }
}
