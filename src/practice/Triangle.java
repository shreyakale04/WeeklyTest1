package practice;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 5; // Height of the pyramid
        
        System.out.print("Enter the number of rows: ");
        int rows1 = scanner.nextInt();
        
        // Outer loop handles the rows
        for (int i = 1; i <= rows1; i++) {
            
            // Inner loop handles the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Moves the cursor to the next line after completing a row
            System.out.println();
        }
        
        scanner.close();
    
    
//    public class PyramidPattern {
//        public static void main(String[] args) {
            

            // Outer loop handles the number of rows
            for (int i = 1; i <= rows; i++) {
                
                // Inner loop 1: Prints the leading spaces for alignment
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                
                // Inner loop 2: Prints the stars for each row
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                
                // Moves the cursor to a new line after completing a row
                System.out.println();
            }
        }
    }


