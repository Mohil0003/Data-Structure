import java.util.Scanner;

public class Matrix_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Matrix : ");
        int a1[][] = new int[2][2];
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
                System.out.print("Enter Number : ");
                a1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix : ");
        int a2[][] = new int[2][2];
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
                System.out.print("Enter Number : ");
                a2[i][j] = sc.nextInt();
            }
        }

        int b[][] = new int[2][2];

        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
                b[i][j] = a1[i][j] + a2[i][j];
            }
        }

        System.out.println("After Addition : ");

        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
                System.out.print(b[i][j]);
            }
            System.out.println(" ");
        }


    }
}
