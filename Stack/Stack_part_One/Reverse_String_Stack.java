package Stack.Stack_part_One;

import java.util.Stack;

public class Reverse_String_Stack {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            // result.append(s.pop());
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Hello";
        String Result = reverseString(str);
        System.out.println(Result);
    }
}
