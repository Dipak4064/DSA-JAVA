package Stack.Stack_part_One;

import java.util.Stack;

public class Bootom_add_stack {
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        pushAtBottom(stack, 4);
        while (!stack.isEmpty()) {
            // System.out.println(stack.peek());
            // stack.pop();
            System.out.println(stack.pop());
        }
    }
}
