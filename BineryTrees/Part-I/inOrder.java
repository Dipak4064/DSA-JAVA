
public class inOrder {
    // Tc: O(n) and sc: O(n)
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1)
                return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // public static void preOrderTraversal(Node root) {
    // if (root == null) {
    // return;
    // }
    // System.out.print(root.data + " ");
    // preOrderTraversal(root.left);
    // preOrderTraversal(root.right);
    // }
    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // binaryTree tree = new binaryTree();
        // Node root = tree.buildTree(nodes);
        Node root = binaryTree.buildTree(nodes);
        System.out.println("Root Node: " + root.data);
        inOrderTraversal(root);
    }

}
