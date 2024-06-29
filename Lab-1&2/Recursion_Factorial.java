import java.util.Scanner;

public class Recursion_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int x = sc.nextInt();
        int y = Factorial(x);
        System.out.println(y);
    }

    static int Factorial(int x){
        if(x==1){
            return 1;
        }else{
            return x*Factorial(x-1);
        }
    }
}
