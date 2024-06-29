import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array");
        int n = sc.nextInt();
        int [] a = new int[n];
        int count=0;
        for(int i=0 ; i<n ; i++){
            System.out.println("Enter Number");
            a[i] = sc.nextInt();
        }

        for(int i=0 ; i<n-1 ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("Not Duplicate Number in array");
        } else{
            System.out.println("Duplicate");
        }
    }
}
