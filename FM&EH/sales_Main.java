
import java.util.Scanner;

class Salesman 
{
    private String name;
    private int salesmanCode;
    private double salesAmount;

    public Salesman(String name, int salesmanCode, double salesAmount) throws IllegalArgumentException 
    {
        if (salesAmount < 0)
        {
            throw new IllegalArgumentException("Sales amount cannot be negative.");
        }
        this.name = name;
        this.salesmanCode = salesmanCode;
        this.salesAmount = salesAmount;
    }

    public double calculateCommission() 
    {
        double commission;
        if (salesAmount < 2000) 
        {
            commission = salesAmount * 0.08;
        } 
        else if (salesAmount >= 2000 && salesAmount <= 5000) 
        {
            commission = salesAmount * 0.10;
        } 
        else 
        {
            commission = salesAmount * 0.12;
        }
        return commission;
    }

    public void displaySalesmanDetails() 
    {
        System.out.println("Salesman Name: " + name);
        System.out.println("Salesman Code: " + salesmanCode);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + calculateCommission());
    }
}

public class sales_Main
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter salesman name: ");
        String name = scanner.nextLine();
        System.out.print("Enter salesman code: ");
        int code = scanner.nextInt();
        System.out.print("Enter sales amount: ");
        double salesAmount = scanner.nextDouble();
        try 
        {
            Salesman salesman = new Salesman(name, code, salesAmount);
            salesman.displaySalesmanDetails();
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
