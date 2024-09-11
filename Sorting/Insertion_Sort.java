// Insertion Sort 


// Step-1 : Assume first element as a Sorted Portion and remaining all elements are unsorted 
// Step-2 : First Element of unsorted portion insert in sorted portion with correct order
// Step-3 : Repeat all above both steps until all elements of unsorted portion moved into sorted portion


// Time Complexity : O(n^2)


import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int N = sc.nextInt();

        int a[] = new int[N];
        
        System.out.println("Enter Array : ");
        for(int i=0 ; i<N ; i++){
            a[i] = sc.nextInt();
        }

        for(int i=1 ; i<N ; i++){
            int key = a[i];
            int j = i-1;

            while (j>=0 && key < a[j]) {
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = key; //placement of Element
        }

        System.out.println("After Sorted : ");
        for(int i=0 ; i<N ; i++){
            System.out.println(a[i]);
        } 
    }
}
