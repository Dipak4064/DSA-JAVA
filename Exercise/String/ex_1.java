package Exercise.String;

import java.util.Scanner;

public class ex_1 {
    public static int countVowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' ||str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String!");
        str = sc.nextLine();
        System.out.println(countVowel(str));
    }

}
