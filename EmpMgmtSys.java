import java.util.Scanner;
abstract class Emp {
    protected String name;
    protected int id;

    public Emp(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public abstract int calculateSalary();

    public void display() {
        System.out.println("Employee ID: " + id + "Name: " + name + "Salary: Rs" + calculateSalary());
    }
}
class FullTimeEmp extends Emp {
    int  salary;
    public FullTimeEmp(String name, int id, int salary) {
        super(name, id);
        this.salary = salary;
    }
    public int calculateSalary() {
        return salary;
    }
}
class PartTimeEmp extends Emp {
    int rate;
    int hours_worked;
    public PartTimeEmp(String name, int id, int rate, int hours_worked) {
        super(name, id);
        this.rate = rate;
        this.hours_worked = hours_worked;
    }
    public int calculateSalary() {
        return rate * hours_worked;
    }
}
public class EmpMgmtSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full-time employee name: ");
        String ftName = sc.nextLine();
        System.out.print("Enter full-time employee ID: ");
        int ftId = sc.nextInt();
        System.out.print("Enter full-time employee salary: ");
        int ftSalary = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter part-time employee name: ");
        String ptName = sc.nextLine();
        System.out.print("Enter part-time employee ID: ");
        int ptId = sc.nextInt();
        System.out.print("Enter part-time employee hourly rate: ");
        int ptRate = sc.nextInt();
        System.out.print("Enter part-time employee hours worked: ");
        int ptHours = sc.nextInt();

        Emp fullTimeEmployee = new FullTimeEmp(ftName, ftId, ftSalary);
        Emp partTimeEmployee = new PartTimeEmp(ptName, ptId, ptRate, ptHours);

        fullTimeEmployee.display();
        partTimeEmployee.display();

        sc.close();
    }
}
