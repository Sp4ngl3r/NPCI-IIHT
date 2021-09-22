// Assignment 3 : Find the appropriate data type required for the given value

package Assignment_21_09_2021;
import java.util.*;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start typing anything.........");
        if (sc.hasNextByte())
            System.out.println("It is compatible with byte, short, int and long, but byte is optimal");
        else if (sc.hasNextShort())
            System.out.println("It is compatible with short, int and long, but short is optimal");
        else if (sc.hasNextInt())
            System.out.println("It is compatible with int and long, but int is optimal");
        else if (sc.hasNextLong())
            System.out.println("It is compatible with long only");
        else if (sc.hasNextFloat())
            System.out.println("It is compatible with float and double, but float is optimal");
        else if (sc.hasNextDouble())
            System.out.println("It is compatible with double only");
        else if (sc.hasNextBoolean())
            System.out.println("It is compatible with boolean only");
        else
            System.out.println("It is not compatible with any of the data types");
        sc.close();
    }
}
