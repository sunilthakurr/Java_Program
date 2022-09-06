package Stack;

import java.util.Stack;

public class UsingStackCollection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        int[] arr = {1, 2, 3, 4, 5};

        for (int j : arr) {
            stack.push(j);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.peek() + " " + stack.pop());
        }
    }
}
