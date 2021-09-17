// Assignment 1 : To arrange the array into ascending order

import java.util.*;

class Assignment1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n-i-1; j++)
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

        System.out.println("The ascending order of the elements are ");
        for (int i = 0; i < n; i++) {
                System.out.print(a[i]+" ");
        }

        System.out.println();
        sc.close();
    }
}