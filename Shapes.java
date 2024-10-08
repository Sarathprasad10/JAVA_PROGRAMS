import java.util.Scanner;

// Abstract Shape class
abstract class Shape 
{
    // Abstract method to get the number of sides
    abstract void numberOfSides();
}

class Rectangle extends Shape
 {
    void numberOfSides() 
    {
        System.out.println("A rectangle has 4 sides.");
    }
}

class Triangle extends Shape 
{
    void numberOfSides()
     {
        System.out.println("A triangle has 3 sides.");
    }
}

class Hexagon extends Shape 
{
    void numberOfSides() 
    {
        System.out.println("A hexagon has 6 sides.");
    }
}

public class Shapes 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Choose a shape\n1.Rectangle\t2.Triangle\n3.Hexagon\t4.Exit: ");
            int choice = scanner.nextInt();
            if (choice == 4)
            {
                break;
            }
            Shape shape;
            switch (choice) 
            {
                case 1:
                    shape = new Rectangle();
                    shape.numberOfSides();
                    break;
                case 2:
                    shape = new Triangle();
                    shape.numberOfSides();
                    break;
                case 3:
                    shape = new Hexagon();
                    shape.numberOfSides();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return;
            }

        }
        scanner.close();
    }
}
