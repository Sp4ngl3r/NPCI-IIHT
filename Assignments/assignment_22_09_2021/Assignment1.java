// Assignment 1 : Design required matrix pattern 

package assignment_22_09_2021;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size and column size of the required matrix:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        int ctr = 0;
        for (int i = 0; i < n; i++)
            if (i % 2 != 0) {
                for (int j = m - 1; j >= 0; j--)
                    a[i][j] = ++ctr;
            } else {
                for (int j = 0; j < m; j++)
                    a[i][j] = ++ctr;
            }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
