//This code is an example of using interfaces and polymorphism in Java
import java.io.*;

interface IShape 
{
    public double area();
    public double perimeter();
}

class Rectangle implements IShape 
{
    double l, b;

    public Rectangle(double l, double b) 
    {
        this.l = l;
        this.b = b;
    }

    public double area() 
    {
        return l * b;
    }

    public double perimeter() 
    {
        return 2 * (l + b);
    }
}

class Circle implements IShape 
{
    double r;

    public Circle(double r) 
    {
        this.r = r;
    }

    public double area() 
    {
        return Math.PI * r * r;
    }

    public double perimeter() 
    {
        return 2 * Math.PI * r;
    }
}

public class Interface_Polymorphism 
{
    public static void main(String args[]) 
    {
        IShape obj[];
        int n, i, ch;
        DataInputStream Din = new DataInputStream(System.in);
        try 
        {
            System.out.println("Enter the number of objects");
            n = Integer.parseInt(Din.readLine());
            obj = new IShape[n];
            for (i = 0; i < n; i++) 
            {
                System.out.println("1.Rectangle\n2.Circle");
                ch = Integer.parseInt(Din.readLine());
                if (ch == 1) 
                {
                    double l, b;
                    System.out.println("Enter the length & breadth");
                    l = Double.parseDouble(Din.readLine());
                    b = Double.parseDouble(Din.readLine());
                    obj[i] = new Rectangle(l, b);
                } 
                else 
                {
                    double r;
                    System.out.println("Enter the radius");
                    r = Double.parseDouble(Din.readLine());
                    obj[i] = new Circle(r);
                }
            }
            for (i = 0; i < n; i++) 
            {
                System.out.println("Area: " + obj[i].area());
                System.out.println("Perimeter: " + obj[i].perimeter());
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
