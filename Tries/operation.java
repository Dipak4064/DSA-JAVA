package Tries;

public class operation {
    static class Node{
        Node children[] = new Node[26];
        boolean isEndOfWord;
        Node(){
            isEndOfWord = false;
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    //Asked by google, microsoft, amazon very very important
    public static void insert(String key){ //O(n) where n is the length of the key
        Node curr = root;
        for(int i=0;i<key.length();i++){
            int index = key.charAt(i) - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.isEndOfWord = true;
    }
    public static boolean search(String key){//Tc: O(L) where L is the length of the key
        Node temp = root;
        for(int i=0;i<key.length();i++){
            int index = key.charAt(i) - 'a';
            if(temp.children[index] == null){
                return false;
            }
            temp = temp.children[index];
        }
        return (temp != null && temp.isEndOfWord);
    }
    public static void main(String[] args) {
        String word[] = { "the", "a", "there", "any", "their", "thee" };
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
        System.out.println(search("the"));
        System.out.println(search("these"));
    }
}
