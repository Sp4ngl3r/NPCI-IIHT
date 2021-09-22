// Assignment 4 : Print Reverse Fibonacci Series

package assignment_21_09_2021;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of reverse fibonacci series");
        int n = sc.nextInt();

        System.out.println("The elements in reverse order fibonacci series ");
        int prev = 0;
        int next = 1;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = prev + next;
            prev = next;
            next = sum;
        }

        while (sum != 0) {
            System.out.print(sum + " ");
            int k = sum - prev;
            sum = prev;
            prev = k;
        }
        System.out.println("0");

        sc.close();
    }
}
