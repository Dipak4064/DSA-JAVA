public class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
            return root;
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
            return root;
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode temp = root.right;
                temp = inorderSuccessor(temp);
                root.val = temp.val;
                root.right = deleteNode(root.right, temp.val);
                return root;
            }
        }
    }

    TreeNode inorderSuccessor(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
