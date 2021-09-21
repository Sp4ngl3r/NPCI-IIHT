// Assignment 3 : Implement the functionalities of Circular Queues

import java.util.*;

public class Assignment3 {
    // Class to implement Circular Queue operations
    public static class CircularQueue {
        int maxSize, front, rear, currentSize;
        ArrayList<Integer> cqueue = new ArrayList<>();

        CircularQueue(int maxSize) {
            this.maxSize = maxSize;
            this.front = this.rear = -1;
            currentSize = 0;
            cqueue = new ArrayList<>(Collections.nCopies(maxSize, (Integer) null));
        }

        // Adding an element to Cicular Queue
        void enCQueue(int value) {
            if (currentSize == maxSize) {
                System.out.println("\nThe Circular Queue is full, hence element " + value + " cannot be added");
                return;
            } else {
                rear = (rear + 1) % maxSize;
                cqueue.set(rear, value);
                currentSize++;
                if (front == -1)
                    front = 0;
                System.out.println("\nThe element " + value + " has been added to the Circular Queue");
            }
        }

        // Removing an element from Cicular Queue
        int deCQueue() {
            if (currentSize == 0) {
                System.out.println("\nThe Circular Queue is empty, hence there is nothing to delete");
                return -1;
            } else {
                int deletedElement = cqueue.get(front);
                cqueue.set(front, null);
                front = (front + 1) % maxSize;
                currentSize--;
                System.out.println("\nThe element " + deletedElement + " has been deleted from the Circular Queue");
                return deletedElement;
            }
        }

        // Displaying the Circular Queue
        void displayCQueue() {
            System.out.print("\nThe elements in the Circular Queue are: ");
            for (Integer element : cqueue) {
                System.out.print(element + " ");
            }
            System.out.println("Front index points to " + front + 1);
            System.out.println("Rear index points to " + rear + 1);
            System.out.println();
        }
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        clearScreen();
        System.out.println("Enter the limit for the Circular Queue");
        int n = sc.nextInt();
        CircularQueue cQueue = new CircularQueue(n);

        int ch = 1;
        while (ch != 0) {
            System.out.println("\nEnter the following options for respective operations");
            System.out.println("1 for enQueue / Adding element");
            System.out.println("2 for deQueue / Removing element");
            System.out.println("3 for printing the Circular Queue");
            System.out.println("0 to quit");
            System.out.println("Enter the correct option:");
            ch = sc.nextInt();

            switch (ch) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("\nEnter the element to be added to the Circular Queue:");
                    int x = sc.nextInt();
                    cQueue.enCQueue(x);
                    // clearScreen();
                    break;
                case 2:
                    cQueue.deCQueue();
                    // clearScreen();
                    break;
                case 3:
                    cQueue.displayCQueue();
                    // clearScreen();
                    break;
                default:
                    System.out.println("\nPlease enter valid option.......!");
            }
        }

        System.out.println();
        sc.close();
    }
}
