import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][2];
        int b[][] = new int[2][3];
        int c[][] = new int[3][3];
        
        
        for(int i= 0 ; i<3 ; i++ ){
            for(int j=0 ; j<2 ; j++){
                System.out.print("Enter value of a[" + i + "][" + j + "] : ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("-----------------------------------");

        for(int i= 0 ; i<2 ; i++ ){
            for(int j=0 ; j<3 ; j++){
                System.out.print("Enter value of a[" + i + "][" + j + "] : ");
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("-----------------------------------");

        for(int i= 0 ; i<3 ; i++ ){
            for(int j=0 ; j<3 ; j++){
                for(int k=0 ; k<2 ; k++){
                    c[i][j] += a[j][k] * b[k][j];
                }
            }
        }

        for(int i= 0 ; i<3 ; i++ ){
            for(int j=0 ; j<3 ; j++){
                System.out.print(c[i][j] + "");
            }
            System.out.println();
        }
    }
}
