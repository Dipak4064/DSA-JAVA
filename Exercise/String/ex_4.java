package Exercise.String;

import java.util.*;

public class ex_4 {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);
            boolean result = Arrays.equals(str1CharArray, str2CharArray);
            if (result) {
                System.out.println(str1 + "and" + str2 + "are anagrams to each other!");
            } else {
                System.out.println(str1 + "and" + str2 + "are NOT anagrams to each other!");
            }
        } else {
            System.out.println(str1 + "and" + str2 + "are Not have equal idx, anagrams to each other!");
        }
    }
}
