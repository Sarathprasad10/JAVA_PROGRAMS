import java.util.*;

interface P 
{
    void methodP();
}

interface P1 extends P 
{
    void methodP1();
}

interface P2 extends P 
{
    void methodP2();
}

interface P12 extends P1, P2 
{

}

class Q implements P12 
{
    private int constantP;
    private int constantP1;
    private int constantP2;

    public Q(int constantP, int constantP1, int constantP2) 
    {
        this.constantP = constantP;
        this.constantP1 = constantP1;
        this.constantP2 = constantP2;
    }

    public void methodP1() 
    {
        System.out.println("Constant from P1: " + constantP1);
    }

    public void methodP2() 
    {
        System.out.println("Constant from P2: " + constantP2);
    }

    public void methodP() 
    {
        System.out.println("Constant from P: " + constantP);
    }
}

public class Interface_Inheritance 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter constant value for P: ");
        int constantP = scanner.nextInt();

        System.out.print("Enter constant value for P1: ");
        int constantP1 = scanner.nextInt();

        System.out.print("Enter constant value for P2: ");
        int constantP2 = scanner.nextInt();

        Q q = new Q(constantP, constantP1, constantP2);

        q.methodP();
        q.methodP1();
        q.methodP2();

        scanner.close();
    }
}
