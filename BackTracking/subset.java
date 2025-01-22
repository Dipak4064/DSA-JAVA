package BackTracking;

public class subset {

    public static void findSubset(String str, String ans, int i) {
        //base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("Empty,");
            } else {

                System.out.print(ans + ",");
            }

            return;
        }
        //recursion
        //backtrack
        //Yes choice
        findSubset(str, ans + str.charAt(i), i + 1);
        //N choice
        findSubset(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);

    }

}
