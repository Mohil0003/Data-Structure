import java.util.Scanner;

class Student_Detail{
    String Name;
    int En_No;
    int Sem;
    float Cpi;
}
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_Detail  s[] = new Student_Detail[5];
        for(int i=0 ; i<5 ; i++){
            s[i]= new Student_Detail();
            System.out.println("Enter Student Name : ");
            s[i].Name = sc.next();
            System.out.println("Enter Enrollment no : ");
            s[i].En_No = sc.nextInt();
            System.out.println("Enter Semester : ");
            s[i].Sem = sc.nextInt();
            System.out.println("Enter CPI : ");
            s[i].Cpi=sc.nextFloat();
        }

        System.out.println("-------------  All Students ----------");

        for(int i=0 ; i<5 ; i++){
            System.out.println("Student Name : ");
            System.out.println(s[i].Name);
            System.out.println("Enrollment no : ");
            System.out.println(s[i].En_No);
            System.out.println("Semester : ");
            System.out.println(s[i].Sem);
            System.out.println("CPI : ");
            System.out.println(s[i].Cpi);
        }

    
    }
}
