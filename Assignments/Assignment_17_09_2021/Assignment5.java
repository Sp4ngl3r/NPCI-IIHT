// Assignment 5 : Sort the elements in a Linkedlist & push them into a Queue

package Assignment_17_09_2021;
public class Assignment5 {
    Node head = null;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node sortingAndMerging(Node left, Node right) {
        Node result = null;
        if (left == null)
            return right;
        else if (right == null)
            return left;
        else if (left.data < right.data) {
            result = left;
            result.next = sortingAndMerging(left.next, right);
        } else {
            result = right;
            result.next = sortingAndMerging(left, right.next);
        }
        return result;
    }

    // Merge Sort function for Linked list
    Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        // Get the middle element
        Node middleNode = obtainMiddle(head);
        Node nodeAfterMiddle = middleNode.next;

        middleNode.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(nodeAfterMiddle);

        return sortingAndMerging(left, right);
    }

    // To obtain middle element in the Linked List
    static Node obtainMiddle(Node head) {
        if (head == null)
            return head;

        Node singleStep = head, doubleStep = head;
        while (doubleStep.next != null && doubleStep.next.next != null) {
            singleStep = singleStep.next;
            doubleStep = doubleStep.next.next;
        }
        return singleStep;
    }

    void addNode(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    void displayLinkedList(Node head) {
        System.out.print("The elements in the Linked List are ");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Assignment5 linkedList = new Assignment5();

        linkedList.addNode(5);
        linkedList.addNode(4);
        linkedList.addNode(893);
        linkedList.addNode(74);
        linkedList.addNode(3);
        linkedList.addNode(433);
        linkedList.addNode(50);

        System.out.println("\nBefore Sorting");
        linkedList.displayLinkedList(linkedList.head);

        linkedList.head = linkedList.mergeSort(linkedList.head);

        System.out.println("\nAfter Sorting");
        linkedList.displayLinkedList(linkedList.head);

        LinkedListToQueue queue = new LinkedListToQueue();
        Node node = linkedList.head;
        while (node != null) {
            queue.enqueue(node.data);
            node = node.next;
        }
        System.out.println();
        queue.displayQueue();
    }

}

class LinkedListToQueue {
    Assignment5.Node front, rear;

    LinkedListToQueue() {
        this.front = this.rear = null;
    }

    void enqueue(int value) {
        Assignment5.Node newNode = new Assignment5.Node(value);

        // Check whether Queue is empty
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    void displayQueue() {
        if (front == null)
            System.out.println("The Queue is empty");
        else {
            System.out.println("The elements in Queue are ");
            Assignment5.Node node = front;
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.println();
        }
    }
}
