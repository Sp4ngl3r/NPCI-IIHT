// Assignment 2 : To find the position of the element in the array

import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter the element to be found");
        int k = sc.nextInt();
        boolean f = false;

        System.out.println("How many occurances do you want to see?");
        System.out.println("Case 1: Only the first occurance");
        System.out.println("Case 2: All the occurances");
        System.out.println("Choose either of 1 or 2: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                for (int i = 0; i < n; i++) {
                    if (a[i] == k) {
                        f = true;
                        System.out.println(k + " was found at position " + (i + 1));
                        break;
                    }
                }
                if (!f) {
                    System.out.println(k+" was not found in array");
                }
                break;
            case 2:
                for (int i = 0; i < n; i++) {
                    if (a[i] == k) {
                        f = true;
                        System.out.println(k + " was found at position " + (i + 1));
                    }
                }
                if (!f) {
                    System.out.println(k+" was not found in array");
                }
                break;    
        }

        sc.close();
    }
}