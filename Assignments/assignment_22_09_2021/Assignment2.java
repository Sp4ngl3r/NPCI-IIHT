// Assignment 2 : Construct a Tower based on a given criteria

package assignment_22_09_2021;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the tower:");
        int n= sc.nextInt();

        System.out.println("\nThe expected Tower is");

        int sum=5;
        System.out.println("1");
        System.out.println("2 2");
        for (int i = 3; i <= n; i++) {
            int x=sum;
            for (int j = 1; j <= i; j++) {
                System.out.print(x+" ");
                sum+=x;
            }
            System.out.println();
        }

        sc.close();
    }
}
