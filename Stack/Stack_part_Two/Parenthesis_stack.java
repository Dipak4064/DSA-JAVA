package Stack.Stack_part_Two;

import java.util.Stack;

public class Parenthesis_stack {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // closing bracket
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if (top == '(' && ch == ')' || top == '{' && ch == '}' || top == '[' && ch == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "{[()]})";
        System.out.println(isValid(str));
    }
}
