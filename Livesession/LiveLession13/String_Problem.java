package Livesession.LiveLession13;
import java.util.Arrays;
import java.util.Scanner;
public class String_Problem {
public static void main(String[] args) {

    //Finding the number of lower vowels in the string
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String ch = sc.nextLine();
    int count = 0 ;
    for(int i=0;i<ch.length();i++){
        if(ch.charAt(i)=='a'||ch.charAt(i)=='e'||ch.charAt(i)=='i'||ch.charAt(i)=='o'||ch.charAt(i)=='u'){
            count++;
    }
    sc.close();
}
System.out.println("The number of vowels in the string is "+count);

//Finding the string are anagram or not
    String s1 = "eat";
    String s2 = "tea";
    char[] s1arr = s1.toCharArray();
    char[] s2arr = s2.toCharArray();
    Arrays.sort(s1arr);
    Arrays.sort(s2arr);
    if(Arrays.equals(s1arr, s2arr)){
        System.out.println("Anagram");
    }else{
        System.out.println("Not Anagram");
    }
 }
}
