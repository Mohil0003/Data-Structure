import java.util.*;

public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        int a = sc.nextInt();

        double x = (3.14 * a * a);

        System.out.println("Area of Circle is :" + x);
    }
}
