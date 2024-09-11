// Radix Sort


// Algorithm is based sorting element dogot by digit
// It used CountSort algorithm


// Time Complexity : O(n*d)
// where n is number of array's element  and d is the number of digit in the largest number



import java.util.Arrays;
import java.util.Scanner;

public class Radix_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 121, 432, 564, 23, 1, 45, 788 };
        int n = arr.length;
        Radix(arr, n);

    }


    public static int get_Max(int arr[], int n) {
        int m = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }

        return m;
    }

    // this is function to do counting sort of array according to the
    // digit represented by place
    public static void countSort(int arr[] , int  n , int place){
        int output[] = new int[n];
        int count[] = new int[10];

        Arrays.fill(count , 0); // count[] all element are filled with zero

        for(int i=0 ; i<n ; i++){
            count[(arr[i]/place)%10]++;
        }

        for(int i=1 ; i<10 ; i++){
            count[i] += count[i-1];
        }

        for(int i=n-1; i>=0 ; i--){
            output[count[(arr[i]/place)%10]-1] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        for(int i=0 ; i<n ; i++){
            arr[i] = output[i];
        }
        
    }


    public static void Radix(int arr[], int n) {
        int max = get_Max(arr, n);// find max number from array 

        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, n, place);
        }


        for(int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }

    }
}
