package Tries;

public class longestPrefix {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }            
        }
    }
    public static Node root = new Node();
    public static void insert(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }
    public static String ans = "";
    public static void lagestprefixword(Node root, StringBuilder tem){
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow) {
                char ch  = (char) (i + 'a');
                tem.append(ch);
                if(tem.length() > ans.length()){
                    ans = tem.toString();
                }
                lagestprefixword(root.children[i], tem);
                tem.deleteCharAt(tem.length()-1); 
            }
        }
    }
    public static void main(String[] args) {
        String word[] = {"a","banana","app","appl","ap","apply","apple"};
        for (String s : word) {
            insert(s);
        }
        StringBuilder tem = new StringBuilder();
        lagestprefixword(root, tem);
        System.out.println(ans);
    }
}
