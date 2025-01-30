package Stack.Stack_part_One;

import java.util.Stack;

class Stack_Stock_Span {
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;// span always going to be 1 for the first day
        stack.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!stack.isEmpty() && stocks[stack.peek()] < currPrice) {
                // if current price is high then pop the previous price until highest price
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = stack.peek();
                span[i] = i - prevHigh;
            }
            stack.push(i);// adding idx to in stack
        }
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 75, 85, 100 };
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
