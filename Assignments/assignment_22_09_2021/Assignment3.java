// Assignment 3 : Sum of 2 matrices

package assignment_22_09_2021;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order of matrices");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];
        System.out.println("\nEnter the first matrix");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        System.out.println("\nEnter the second matrix");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                c[i][j] = a[i][j] + b[i][j];
                
                
        System.out.println("\nThe resultant matrix is");

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                System.out.print(c[i][j]+" ");
            System.out.println();

        sc.close();
    }
}
