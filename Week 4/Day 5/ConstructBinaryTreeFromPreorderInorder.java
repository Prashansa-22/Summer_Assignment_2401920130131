class Solution {
    int preIndex = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return construct(preorder, 0, inorder.length - 1);
    }
    public TreeNode construct(int[] preorder, int inStart, int inEnd){
        if(inStart > inEnd){
            return null;
        }
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        int pos = map.get(rootVal);
        root.left = construct(preorder, inStart, pos - 1);
        root.right = construct(preorder, pos + 1, inEnd);
        return root;
    }
}
