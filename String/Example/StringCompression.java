package String.Example;

//"aaabbbbccc" = "a3b4c3"
public class StringCompression {

    //WITHOUT USING STRING BUILDER
    public static String compres(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        System.out.println("COMPRESS METHOD O1");
        return newStr;
    }

    //USING STRING BUILDER
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        System.out.println("COMPRESS METHOD O2");
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbbccd";
        System.out.println(compres(str));
        System.out.println(compress(str));
    }
}
