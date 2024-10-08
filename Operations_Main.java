import java.util.Scanner;

interface Operations 
{
    double PI = 3.14;

    double area();

    double volume();
}

class Cylinder implements Operations 
{
    double height;

    public Cylinder(double height) 
    {
        this.height = height;
    }

    public double area() 
    {
        return 2 * PI * height;
    }

    public double volume() 
    {
        return PI * height * height;
    }
}

public class Operations_Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        Cylinder cylinder = new Cylinder(height);
        double area = cylinder.area();
        double volume = cylinder.volume();

        System.out.println("Area of the cylinder: " + area);
        System.out.println("Volume of the cylinder: " + volume);

        scanner.close();
    }
}
