import java.util.Scanner;

public class Matrix_Multiplication {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and columns for the matrices: ");
        int rows = scanner.nextInt();
        int  cols = scanner.nextInt();
        int[][] matrix1 = readMatrix(scanner, rows, cols);
        int[][] matrix2 = readMatrix(scanner, rows, cols);
        
        scanner.close();
        
        int[][] result = multiplyMatrices(matrix1, matrix2);
        
        System.out.println("Resultant Matrix:");
        printMatrix(result);
    }
    
    public static int[][] readMatrix(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter element [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        return matrix;
    }
    
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int size = matrix1.length;
        int[][] result = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        return result;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
