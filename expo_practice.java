
public class expo_practice {
    public static void findPermutation(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            String newStar = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStar, ans + currchar);
        }
    }

    public static void main(String[] args) {
        // Learning about the nqueen problem
        String str = "abc";
        findPermutation(str, "");
    }
}
