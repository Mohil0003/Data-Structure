// Merge Sort


// This algorithm works on array convert in subpart , sorting them and after merge all elements
// this is known as divide & conquer algorithm

// procedure:
// Divide the unsorted list into N sub lists , each containing 1 element
// Take adjacent pair and merge them to form of a list of 2 members. N will convert into N/2 lists of size 2
// Repeat the process till a single sorted list 



// Time Complexity : O( n logn )


import java.util.Scanner;

public class Merge_Sort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();

        int []arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);

        System.out.println("Afer Sorted : ");

        for(int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }

    }


    public static void sort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        mergeSort(low, high, arr);
    }

    public static void mergeSort(int low, int high, int[] arr) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid, arr);
            mergeSort(mid + 1, high, arr);
            merge(low, mid, high, arr);
        }
    }

    public static void merge(int low, int mid, int high, int[] arr) {

        int[] localArr = new int[high + 1];
        int leftIdx = low, rigthIdx = mid + 1, localI = low;

        while (leftIdx <= mid && rigthIdx <= high) {
            if (arr[leftIdx] <= arr[rigthIdx]) {
                localArr[localI] = arr[leftIdx++];
            } else {
                localArr[localI] = arr[rigthIdx++];
            }
            localI++;
        }

        if (leftIdx > mid) {
            for (int k = rigthIdx; k <= high; k++) {
                localArr[localI++] = arr[k];
            }
        } else {
            for (int k = leftIdx; k <= mid; k++) {
                localArr[localI++] = arr[k];
            }
        }

        for (int i = low; i <= high; i++) {
            arr[i] = localArr[i];
        }
    }
    
}
