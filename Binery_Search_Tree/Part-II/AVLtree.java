class AVLtree {
    static class Node {
        int data;
        Node left, right;
        int height;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
            this.height = 1;
        }
    }

    public static Node root;

    // finding the Node height
    public static int height(Node node) {
        if (node == null)
            return 0;
        return node.height;
    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root;// Duplicate keys are not allowed
        }
        // Update the height of the root
        root.height = 1 + Math.max(height(root.left), height(root.right));
        // Get the balance factor of this ancestor node to check whether this node became
        int bf = getBalance(root);
        //Left Left Case
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }
        // Right Right Case
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }
        // Left Right Case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        // Right Left Case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    //Checking the balance factor of the node
    public static int getBalance(Node node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }
    //Left rotate subtree rooted with x
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        // Perform rotation
        y.left = x;
        x.right = T2;
        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        // Return new root
        return y;
    }
    //Right rotate subtree rooted with y
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        // Perform rotation
        x.right = y;
        y.left = T2;
        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        // Return new root
        return x;
    }

    //preorder traversal
    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);
        /*
         * AVL Tree
         * 30
         * / \
         * 20 40
         * / \ \
         * 10 25 50
         */
        
        /*
        * Unbalanced AVL Tree
         * 10
         *  \
         *  20
         *   \
         *   30
         *  / \
         * 25  40
         *     \
         *     50
         */
        preOrder(root);
    }
}