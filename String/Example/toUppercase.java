package String.Example;

// import java.util.*;

//import static java.lang.StringLatin1.charAt;
//For a given string covert each the first letter of each word to uppercase

public class toUppercase {
    public static String convertToUppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am dipak tamang";
        System.out.println(convertToUppercase(str));
    }
}
