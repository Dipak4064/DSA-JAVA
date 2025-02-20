package Tries;

public class prefix { //It is asked by google amazone and many other companies
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }
    public static Node root = new Node();   
    public static void insert(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            } else {
                curr.children[index].freq++;
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node root,String prefix ) {
        if (root == null) {
            return;
        }
        if (root.freq == 1) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i], prefix + (char) (i + 'a'));
            }
        }
    }   
    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        for (String s : arr) {
            insert(s);
        }
        root.freq = -1;
        findPrefix(root, "");
    }
}
