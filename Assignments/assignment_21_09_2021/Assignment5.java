// Assignment 5 : Find the duplicates in the array and sort them based on their number of occurance

package assignment_21_09_2021;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total elements in the array:");
        int n = sc.nextInt();

        int a[] = new int[n];
        int duplicates[][] = new int[n][2];
        boolean visited[] = new boolean[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            duplicates[i][0] = a[i];
            duplicates[i][1] = 1;
            visited[i] = false;
        }

        for (int i = 0; i < a.length; i++) {
            if (visited[i])
                continue;
            for (int j = i + 1; j < a.length; j++) {
                if (duplicates[i][0] == a[j]) {
                    visited[j] = true;
                    duplicates[i][1]++;
                }
            }
        }

        System.out.println("\nThe elements and their respective number of duplicates are ");
        for (int i = 0; i < duplicates.length; i++) {
            if (!visited[i]) {
                for (int j = 0; j < duplicates[i][1]; j++) {
                    System.out.print(duplicates[i][0] + " ");
                }
                System.out.println();
            }
        }

        for (int i = 0; i < n; i++) {
            int temp = duplicates[i][1];
            for (int j = 0; j < n - i - 1; j++) {
                if (temp >= duplicates[j][1] && !visited[j] && !visited[i]) {
                    temp = duplicates[j][1];
                    duplicates[j][1] = duplicates[i][1];
                    duplicates[i][1] = temp;

                    temp = duplicates[j][0];
                    duplicates[j][0] = duplicates[i][0];
                    duplicates[i][0] = temp;
                }
            }
        }

        System.out.println("\nThe Sorted groups of Duplicates are");

        for (int i = 0; i < duplicates.length; i++) {
            if (!visited[i]) {
                for (int j = 0; j < duplicates[i][1]; j++) {
                    System.out.print(duplicates[i][0] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}