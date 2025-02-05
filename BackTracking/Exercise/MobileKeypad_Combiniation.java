package Exercise;

public class MobileKeypad_Combiniation {
    final static char[][] L = {
            {},
            {},
            { 'a', 'b', 'c' },
            { 'd', 'e', 'f' },
            { 'g', 'h', 'i' },
            { 'j', 'k', 'l' },
            { 'm', 'n', 'o' },
            { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' },
            { 'w', 'x', 'y', 'z' } };

    public static void letterCombinations(String digits) {
        int len = digits.length();
        if (len == 0)
            return;
        bfs(0, len, new StringBuilder(), digits);
    }

    public static void bfs(int index, int len, StringBuilder sb, String digits) {
        if (index == len) {
            System.out.println(sb.toString());
            return;
        }
        // int num = digits.charAt(index) - '0';
        char[] letter = L[Character.getNumericValue(digits.charAt(index))];
        for (int i = 0; i < letter.length; i++) {
            bfs(index + 1, len, sb.append(letter[i]), digits);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        letterCombinations("2");
    }
}
