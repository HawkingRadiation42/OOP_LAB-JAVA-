
import java.util.*;
class Member{
    String name;
    int age;
    long ph;
    String add;
    double sal;
    
    void printSalary(){
        System.out.println("5.Salary : "+sal);
    }
}
class Employee extends Member{
    String spec;
}

class Manager extends Member{
    String dept;
} 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee obj1 = new Employee();
        Manager obj2 = new Manager();
        System.out.println("Enter name of Employee");
        obj1.name=sc.nextLine();
        System.out.println("Enter age of Employee");
        obj1.age=sc.nextInt();
        System.out.println("Enter phone number of Employee");
        obj1.ph=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter address of Employee");
        obj1.add=sc.nextLine();
        System.out.println("Enter salary of Employee");
        obj1.sal=sc.nextDouble();
        System.out.println("Enter name of Manager");
        obj2.name=sc.next();
        System.out.println("Enter age of Manager");
        obj2.age=sc.nextInt();
        System.out.println("Enter phone number of Manager");
        obj2.ph=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter address of Manager");
        obj2.add=sc.nextLine();
        System.out.println("Enter salary of Manager");
        obj2.sal=sc.nextDouble();
        System.out.println("DETAILS OF EMPLOYEE : ");
        System.out.println("1. Name : "+obj1.name);
        System.out.println("2. Age : "+obj1.age);
        System.out.println("3. Phone Number : "+obj1.ph);
        System.out.println("4. Address : "+obj1.add);
        obj1.printSalary();
        System.out.println();
        System.out.println("DETAILS OF Manager : ");
        System.out.println("1. Name : "+obj2.name);
        System.out.println("2. Age : "+obj2.age);
        System.out.println("3. Phone Number : "+obj2.ph);
        System.out.println("4. Address : "+obj2.add);
        obj2.printSalary();
    }
}
