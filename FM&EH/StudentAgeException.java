import java.util.Scanner;

class InvalidAgeException extends Exception 
{
    public InvalidAgeException(String message) 
    {
        super(message);
    }
}

class Student 
{
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws InvalidAgeException 
    {
        if (age < 15 || age > 21) 
        {
            throw new InvalidAgeException("Invalid age. Age must be between 15 and 21.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayDetails() 
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentAgeException 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try 
        {
            System.out.print("Enter Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Course: ");
            String course = scanner.nextLine();
            Student student = new Student(rollNo, name, age, course);
            System.out.println("\nStudent Details:");
            student.displayDetails();
        } 
        catch (InvalidAgeException e) 
        {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e)
        {
            System.out.println("Error: Invalid input.");
        } 
        finally 
        {
            scanner.close();
        }
    }
}
