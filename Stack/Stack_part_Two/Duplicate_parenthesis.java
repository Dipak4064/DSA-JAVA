package Stack.Stack_part_Two;

import java.util.Stack;

public class Duplicate_parenthesis {
    public static boolean isDuplicate(String str) { // Time Complexity: O(n)
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {// closing bracket
                char top = stack.peek();
                int count = 0;
                // while (!stack.isEmpty() && stack.peek() != '(') {//if there has valid string
                // stack.pop();
                // count++;

                // }
                // if(count<1){
                // return true;//duplicate found
                // }else{
                // stack.pop();
                // }
                while (stack.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true;
                }
            } else { // opening bracket
                stack.push(ch);

            }
        }
        return false;
    }

    public static void main(String[] args) {

        String str = "((a+b)+(c+d))";
        String str2 = "(a-b)+((c+d))";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));

    }
}
