package Stack.Stack_part_One;
import java.util.Stack;
public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new java.util.Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
