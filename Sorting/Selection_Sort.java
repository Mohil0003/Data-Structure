// Selection Sort 


// Array divide in two parts
// 1. sorted part at left end , 2. unsorted part at right end
// First element compare with all elements then swap smallest element 
// Second Element compare with rest elements then swap smallest element and so on.....


// Time Complexity : O(n^2)

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array : ");

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i<n-1 ; i++){
            int min_index = i;

            for(int j=i+1 ; j<n ; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After Sorted : ");

        for(int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }


    }
}
