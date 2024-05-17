package TreeTUF;

public class MaximumPathSumBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    static class Solution {
        public int MaxPathSum(TreeNode root) {
            int[] maxVal = new int[1];
            maxVal[0] = Integer.MIN_VALUE; 
            maxPathDown(maxVal, root);
            return maxVal[0];
        }

        public int maxPathDown(int[] maxVal, TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = Math.max(0, maxPathDown(maxVal, root.left));
            int right = Math.max(0, maxPathDown(maxVal, root.right));
            maxVal[0] = Math.max(maxVal[0], left + right + root.val);

            return root.val + Math.max(left, right);
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(-10);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);

        Solution sol=new Solution();
        int ans=sol.MaxPathSum(root);
        System.out.println(ans);
    }
}
