import java.util.Arrays;
import java.util.Scanner;

public class Enagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        String str2 = sc.nextLine();


        char []s1 = str1.toCharArray();
        char []s2 = str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        if(s1.length != s2.length){
            System.out.println("Non Enagram");
            return;
        }

        for(int i=0 ; i<s1.length ; i++){
            if(s1[i]==s2[i]){
                continue;
            }
            else{
                System.out.println("Non Enagram");
                return;
            }
        }

        System.out.println("Enagram");

    }
}
