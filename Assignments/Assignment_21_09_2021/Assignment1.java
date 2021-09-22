// Assignment 1 : Identify whether the second value is even and square or a multiple of the first value

package Assignment_21_09_2021;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value: ");
        int x = sc.nextInt();
        System.out.println("Enter the second value: ");
        int y = sc.nextInt();

        if (y == (x * x) && y % 2 == 0)
            System.out.println(
                    y + " is even, square and multiple of " + x + ", and " + y + " is " + x + " times of " + x);
        else if (y == (x * x) && y % 2 != 0)
            System.out.println(y + " is square and multiple of " + x + ", and " + y + " is " + x + " times of " + x);
        else if (y % x == 0 && y % 2 == 0)
            System.out.println(y + " is even and multiple of " + x + ", and " + y + " is " + (y / x) + " times of " + x);
        else if (y % x == 0 && y % 2 != 0)
            System.out.println(y + " is multiple of " + x + ", and " + y + " is " + (y / x) + " times of " + x);
        else
            System.out.println(y + " is neither square nor multiple of " + x);

        sc.close();
    }
}
