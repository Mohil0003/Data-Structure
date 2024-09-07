// Linear Search for Arrays


import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array : ");

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Searching Number : ");
        int key = sc.nextInt();

        int res = linear_Search(arr, key);

        if(res==-1){
            System.out.println("Number not Found !!!");
        }else{
            System.out.println("Number Found at index : " + res);
        }


    }

    public static int linear_Search(int arr[] , int key){
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
