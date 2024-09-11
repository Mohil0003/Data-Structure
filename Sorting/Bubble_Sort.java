// Bubble Sort


// Compare with adjacent Element
// first Largest Element of Array is passed at last of the index then
// second Largest Element of Array is passed at second last of the index and so on......
// at the last,  We got sorted array in ascending order


// Time Complexity : O(n^2)


import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int N = sc.nextInt();

        int a[] = new int[N];
        
        System.out.println("Enter Array : ");
        for(int i=0 ; i<N ; i++){
            a[i] = sc.nextInt();
        }


        for(int i=0 ; i<a.length-1 ; i++){
            for(int j=0 ; j<a.length-i-1 ; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp; 
                }
            }        
        }

        System.out.println("After sorted : ");
        for(int i=0 ; i<N ; i++){
            System.out.println(a[i]);
        }

    }
}
