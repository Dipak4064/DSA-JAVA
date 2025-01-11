package String.Example;

public class subString {
    public static <string> String substringarr(String str, int st, int end) {
        String copy = "";
        for (int i = 0; i < end; i++) {
            copy += str.charAt(i);
        }
        return copy;
    }

    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(str.substring(0,5));
//        System.out.println(substringarr(str, 0, 5));
    }
}
