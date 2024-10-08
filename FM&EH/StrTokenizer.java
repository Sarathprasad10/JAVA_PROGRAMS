
import java.util.Scanner;
import java.util.StringTokenizer;

public class StrTokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of integers separated by spaces: ");
        String inputLine = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(inputLine);

        int sum = 0;
        System.out.println("Integers entered:");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            try {
                int num = Integer.parseInt(token);
                System.out.println(num);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Ignoring non-integer token: " + token);
            }
        }

        System.out.println("Sum of all integers: " + sum);
    }
}