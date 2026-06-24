class Solution {
    boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        return search(root.left, key) || search(root.right, key);
    }
}
