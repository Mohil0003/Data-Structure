import java.util.Scanner;

class Employee_Detail{
    int Employee_id;
    String Name;
    String Designation;
    int salary;

}
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee_Detail e1 = new Employee_Detail();
        System.out.println("Enter Employee Name :");
        e1.Name = sc.nextLine();
        System.out.println("Enter Employee Designation : ");
        e1.Designation = sc.nextLine();
        System.out.println("Enter Employee ID : ");
        e1.Employee_id = sc.nextInt();
        System.out.println("Enter Employee Salary : ");
        e1.salary = sc.nextInt();

        System.out.println("--------------------");

        System.out.println("Id : " + e1.Employee_id);
        System.out.println("Name : " + e1.Name);
        System.out.println("Designation : " + e1.Designation);
        System.out.println("Salaray : " + e1.salary);
    }
}
