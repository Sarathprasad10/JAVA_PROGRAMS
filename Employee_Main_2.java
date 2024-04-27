import java.util.Scanner;

class Employee 
{
    public void display() 
    {
        System.out.println("Name of class is Employee.");
    }

    public void calcSalary()
    {
        System.out.println("Salary of employee is 5,0000.");
    }
}

class Engineer extends Employee 
{
    public void calcSalary() 
    {
        System.out.println("Salary of employee is 7,0000.");
    }
}

public class Employee_Main_2
{
    public static void main(String[] args)
    {
        Employee emp = new Engineer();
        emp.display();
        emp.calcSalary();
    }
}
