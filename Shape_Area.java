import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Trapezoid {
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double calculateArea() {
        return (base1 + base2) * height / 2;
    }
}

class Triangle {
    private double baseLength;
    private double height;

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    public double calculateArea() {
        return baseLength * height / 2;
    }
}

public class Shape_Area {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int shape;
        do {

            System.out.println("\nChoose a shape\n");
            System.out.println("1.CIRCLE\t2.RECTANGLE\t3.TRAPEZOID\t4.TRIANGLE\t5.'EXIT' to terminate:");

            shape = s.nextInt();
            s.nextLine();

            switch (shape) {
                case 1:
                    
                    System.out.print("Enter the radius of the circle: ");
                    double radius = s.nextDouble();
                     
                    Circle circle = new Circle(radius);
                    System.out.println("Area of the circle: " + circle.calculateArea());
                     
                    break;
                case 2:
                     
                    System.out.print("Enter the length of the rectangle: ");
                    double length = s.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = s.nextDouble();
                     
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Area of the rectangle: " + rectangle.calculateArea());
                     
                    break;
                case 3:
                     
                    System.out.print("Enter the lengths of the bases of the trapezoid: ");
                    double base1 = s.nextDouble();
                    double base2 = s.nextDouble();
                    System.out.print("Enter the height of the trapezoid: ");
                    double height = s.nextDouble();
                     
                    Trapezoid trapezoid = new Trapezoid(base1, base2, height);
                    System.out.println("Area of the trapezoid: " + trapezoid.calculateArea());
                     
                    break;
                case 4:
                     
                    System.out.print("Enter the base length of the triangle: ");
                    double baseLength = s.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double triangleHeight = s.nextDouble();
                     
                    Triangle triangle = new Triangle(baseLength, triangleHeight);
                    System.out.println("Area of the triangle: " + triangle.calculateArea());
                     
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid shape entered!");
                    break;
            }
            s.nextLine();
        } while (shape!=5);

        s.close();
    }
}

