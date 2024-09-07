// Binary Search of Arrays (Recursive Approach)


import java.util.Scanner;

public class Recursive_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Sorted Array !");
        System.out.println("-----------------------");

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }


        System.out.println("Enter Searching Number : ");
        int key = sc.nextInt();

        int left = 0;
        int right = n-1;

        int r = Binary_Search(arr, left, right, key);

        if(r==-1){
            System.out.println("Number Not Found");
        }else{
            System.out.println("Number found at index : " + r);
        }
        
    }

    public static int Binary_Search(int arr[] , int left , int right , int key){
        if(left <= right){
            int middle = (left + right) / 2;

            if(arr[middle] == key){
                return middle;
            }else if (key < arr[middle]) {
                return Binary_Search(arr, left, middle-1, key);
            }else if (key > arr[middle]) {
                return Binary_Search(arr, middle+1, right, key);
            }
        }

        return -1;
    }
}
