package ArrayList.Exercise;

import java.util.ArrayList;

public class BeautifulNumber {
    public static int[] beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (Integer e : ans) {
                if (2 * e <= n)
                    temp.add(e * 2);
            }
            for (Integer e : ans) {
                if (2 * e - 1 <= n)
                    temp.add(e * 2 - 1);
            }
            ans = temp;
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        // BeautifulNumber bn = new BeautifulNumber();
        int n = 5;
        int[] result = beautifulArray(n);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
