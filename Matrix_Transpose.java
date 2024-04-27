import java.util.Scanner;

public class Matrix_Transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and columns of the matrix: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        int[][] transpose = findTranspose(matrix);
        
        System.out.println("Transpose of the Matrix:");
        printMatrix(transpose);
        
        scanner.close();
    }
    
    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] transpose = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        return transpose;
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
