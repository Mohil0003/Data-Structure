// Quick Sort


// It is Highly efficient sorting algorithm and based on divide & conquer algorithm
// generally first element pick as pivot element 
// Lower Bound is First index and Upper Bound is last index 


// Time Complexity : O(n^2)


import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Size of Array");
        int N = sc.nextInt();

        int []arr = new int[N];

        System.out.println("Enter Array : ");

        for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();     
        }

        int LB = 0;
        int UB = N-1;

        QuickSort(arr,LB,UB);

        System.out.println("After Sorted : ");
        for(int i=0 ; i<N ; i++){
            
            System.out.println(arr[i]);
        }
    }


    public static  void QuickSort(int arr[] , int LB , int UB){

        boolean Flag = true;

        if(LB < UB){
            int i = LB;
            int j = UB +1 ;
            int key = arr[LB];

            while(Flag==true){
                i = i+1;

                while(i<arr.length&& arr[i] < key){
                    i = i+1;
                }

                j = j-1;

                while(j>=0 && arr[j] > key){
                    j = j-1;
                }

                if(i<j){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }else{
                    Flag = false;
                }
            }

            int temp = arr[j];
            arr[j] = arr[LB];
            arr[LB] = temp;

            QuickSort(arr, LB, j-1);
            QuickSort(arr, j+1, UB);
        }
       
    }
}