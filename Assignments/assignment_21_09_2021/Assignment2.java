// Assignment 2 : Calculate the number of digits in the given number

package assignment_21_09_2021;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x = sc.nextInt();

        int numOfDigits = 0;
        int originalNumber = x;
        while (x > 0) {
            numOfDigits++;
            x /= 10;
        }

        if (numOfDigits % 2 == 0) {
            System.out.println("The number of digits in " + originalNumber + " is " + numOfDigits);
            System.out.println("Since it is even, its square is " + (numOfDigits * numOfDigits));
        } else if (numOfDigits % 3 == 0) {
            System.out.println("The number of digits in " + originalNumber + " is " + numOfDigits);
            System.out.println("Since its a multiple of 3, its cube is " + (numOfDigits * numOfDigits * numOfDigits));
        } else {
            if (numOfDigits == 1)
                System.out.println("The number of digits in " + originalNumber + " is " + numOfDigits);
            else {
                System.out.println("The number of digits in " + originalNumber + " is " + numOfDigits);
                numOfDigits--;
                System.out.println("Since its not multiple of 3 or 2, its lowest even number's square is " + (numOfDigits * numOfDigits));
            }
        }
        sc.close();
    }
}
