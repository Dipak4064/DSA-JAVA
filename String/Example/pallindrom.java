package String.Example;

import java.util.Scanner;

public class pallindrom {
    public static boolean isPallindrome(String name) {
        for(int i=0;i<name.length()/2;i++){
            int n = name.length();
            if(name.charAt(i)!=name.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(isPallindrome(name));
    }
}
