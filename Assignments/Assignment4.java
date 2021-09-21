// Assignment 4 : Transform a stack into Queue using a given condition

import java.util.*;

public class Assignment4 {
    static int min1 = Integer.MAX_VALUE;
    static int min2 = Integer.MAX_VALUE;

    static void findTwoSmallest(Stack<Integer> stack) {
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) < min1) {
                min2 = min1;
                min1 = stack.get(i);
            } else if (stack.get(i) < min2 && stack.get(i) != min1) {
                min2 = stack.get(i);
            }
        }
    }

    static Queue<Integer> calculateQueueElemPositions(Stack<Integer> stack) {
        Queue<Integer> queue =new LinkedList<>();
        for (int i = 0; i < stack.size(); i++) {
            if(stack.get(i) % min1 == 0 && stack.get(i) != min1){
                queue.add(stack.get(i));
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            if(stack.get(i) % min2 == 0 && stack.get(i) != min2){
                queue.add(stack.get(i));
            }
        }
        return queue;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        stack.add(6);
        stack.add(12);
        stack.add(2);
        stack.add(15);
        stack.add(17);
        stack.add(3);
        stack.add(9);

        findTwoSmallest(stack);
        System.out.println(stack);
        queue = calculateQueueElemPositions(stack);
        System.out.println(queue);
    }
}
