// Shell Sort


// this sort works on Gap Algorithm
// as like as insertion sort but it avoids large shifts 
// Starting Gap = (array length) / 2 then sort gapped element and after 
// Segment gap = gap/2 and sort gapped element 
// this process execute until gap becomes 0 


// Time Complexity : O(n^2)
// Upper bound for each loop , worst case : O((log n)n^2)






import java.util.Scanner;

public class Shell_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int N = sc.nextInt();

        int a[] = new int[N];
        
        System.out.println("Enter Array : ");
        for(int i=0 ; i<N ; i++){
            a[i] = sc.nextInt();
        }

        for(int gap=N/2 ; gap>=1 ; gap/=2){

            for(int i=gap ; i<N ; i++){

                for(int j=i-gap ; j>=0 ; j-=gap){

                    if(a[j+gap]>a[j]){
                        break;
                    }
                    else{
                        int temp = a[j+gap];
                        a[j+gap] = a[j];
                        a[j] = temp;
                    }

                }
            }
        }

        System.out.println("After Sorted : ");
        for(int i=0 ; i<N ; i++){
            System.out.println(a[i]);
        }
    }
}
