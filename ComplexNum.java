
public class ComplexNum {
    private double real;
    private double imaginary;

    public ComplexNum(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNum sum(ComplexNum other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNum(sumReal, sumImaginary);
    }

    public void display() {
        System.out.println("ComplexNum number: " + this.real + " + " + this.imaginary + "i");
    }

    public static void main(String[] args) {

        ComplexNum CN1 = new ComplexNum(4.5, 2.7);
        ComplexNum CN2 = new ComplexNum(5.3, 42.6);
        ComplexNum CN3;

        CN3 = CN1.sum(CN2);

        System.out.println("First ComplexNum number:");
        CN1.display();
        System.out.println("Second ComplexNum number:");
        CN2.display();
        System.out.println("Sum of the first and second ComplexNum numbers:");
        CN3.display();
    }
}
