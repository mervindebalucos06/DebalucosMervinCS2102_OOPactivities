import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the maximum number for the multiplication table
        System.out.print("Enter the size of the multiplication table: ");
        int max = scanner.nextInt();
        
        // 2D array to hold the multiplication table
        int[][] table = new int[max + 1][max + 1];
        
        // Populate the array using nested loops
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                table[i][j] = i * j;
            }
        }
        
        // Print the multiplication table with proper formatting
        System.out.println("\nMultiplication Table:");
        
        // Nested loops to print the table with formatting
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                System.out.printf("%4d", table[i][j]); // Print each number with 4 spaces
            }
            System.out.println(); // Move to the next line after each row
        }
        
        scanner.close();
    }
}
