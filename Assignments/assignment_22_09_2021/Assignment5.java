// Assignment 5 : Perform fibonacci using two functions

package assignment_22_09_2021;

import java.util.Scanner;

public class Assignment5 {
    static int ctr = 2;

    static void fibonacci1(int a, int b, int n) {
        ctr++;
        int sum = a + b;
        if (ctr > n)
            return;
        else {
            System.out.print(sum + " ");
            a=b;
            b=sum;
            fibonacci1(a, b, n);
        }
    }

    static void fibonacci2(int a, int b, int n) {
        ctr++;
        int sum = a + b;
        if (ctr > n)
            return;
        else {
            System.out.print(sum + " ");
            a=b;
            b=sum;
            fibonacci1(a, b, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size for fibonacci series");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("0 1 ");
        fibonacci1(a, b, n);
        System.out.println();
        sc.close();
    }
}
