import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the  file name: ");
        String fileName = s.nextLine();
        File file = new File(fileName);

        try 
        {
            Scanner fileScanner = new Scanner(file);
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;
            double sum = 0;
            int count = 0;

            while (fileScanner.hasNextDouble()) 
            {
                double number = fileScanner.nextDouble();
                sum += number;
                count++;
                if (number < min) 
                {
                    min = number;
                }
                if (number > max) 
                {
                    max = number;
                }
            }

            if (count == 0) 
            {
                System.out.println("The file is empty.");
            } else 
            {
                double average = sum / count;
                double range = max - min;

                System.out.println("Minimum: " + min);
                System.out.println("Maximum: " + max);
                System.out.println("Average: " + average);
                System.out.println("Range: " + range);
            }
            fileScanner.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found: " + fileName);
        }
    }
}
