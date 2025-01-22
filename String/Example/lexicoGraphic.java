package String.Example;

import java.util.Arrays;

public class lexicoGraphic {
    public static void ascending(String[] str) {
        int n = str.length;
        // String result = "";

        // String[] copy = new String[n];
        for (int i = 0; i < n; i++) {
            String min = str[i];
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (str[j].compareTo(min) < 0) {
                    min = str[i];
                    minIdx = j;

                }
            }
            String temp = str[i];
            str[i] = str[minIdx];
            str[minIdx] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
    }

    public static void main(String[] args) {
        String str[] = {"apple", "mango", "banana"};
        String largest = str[0];
        for (int i = 0; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.println("the larges is = " + largest);
        System.out.println("sorted:");
        ascending(str);
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        Arrays.sort(str,(a,b)->b.compareTo(a));
        System.out.println(Arrays.toString(str));
    }
}
