// Assingment 4 : Test the equality of the matrix

package assignment_22_09_2021;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order of matrices");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        System.out.println("\nEnter the first matrix");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        System.out.println("\nEnter the second matrix");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                b[i][j] = sc.nextInt();

        System.out.println("\nThe Identical matrices are");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j])
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j])
                    System.out.print(b[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
        sc.close();
    }
}
