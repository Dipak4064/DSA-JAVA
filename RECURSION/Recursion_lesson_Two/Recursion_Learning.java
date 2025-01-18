package RECURSION.Recursion_lesson_Two;

public class Recursion_Learning {

    /*----------------------------------------------------------------------------------------- */
    //Asked by Amazon
    //This problem is a filling the tile in the wall and floor and we have to find the total number of title to fillk in the wall and floor
    public static int tilingProblem(int n) {//n( 2 x n ) is the length of the wall and floor
        if (n == 0 || n == 1) {
            return 1;
        }
        //vertical choice
        int verticalTiles = tilingProblem(n - 1);
        //horizontal choice
        int horizontalTiles = tilingProblem(n - 2);
        int totalTiles = verticalTiles + horizontalTiles;
        return totalTiles;
    }

    /*----------------------------------------------------------------------------------------- */

 /*--------------------------------------------------------------------------------------- */
    //Remove duplicate character from the string
    //there use the boolean array to check the duplicate character
    //if the character is occured first time the we will add the character in the newstring and the map index will be true for that character and the index will find the true then we will not add the character in the newstring
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        //kaam karna hai
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            //duplicate hai
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(currChar), map);
        }
    }

    /*-------------------------------------------------------------------------------------------- */
    //friends pairing problem
    public static int paringFreinds(int n) {
        if (n <= 2) {
            return n;
        }
        int single = paringFreinds(n - 1);
        int pair = paringFreinds(n - 2) * (n - 1);
        return single + pair;
    }

    /*-------------------------------------------------------------------------------------------- */
    //Binary String problem 
    //print all binary strings of size N without consecutive ones
    public static void printBinaryString(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        /*-------------------------------------------- */
        // printBinaryString(n - 1, 1, str + "1");
        // if (lastplace == 1) {
        //     printBinaryString(n - 1, 0, str + "0");
        // }
        /*-------------------------------------------- */
        printBinaryString(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }

    }

    /*------------------------------------------------------------------------------------------- */
    public static void main(String[] args) {
        // System.out.println(tilingProblem(3));
        // String str = "appnnacollege";
        // removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        // printBinaryString(3, 1, "");
        // printBinaryString(3, 0, "");
        System.out.println(paringFreinds(4));
    }

}
