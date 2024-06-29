import java.util.*;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();

        if((a%2)==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
