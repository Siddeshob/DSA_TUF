package TreeTUF;

public class BalancedBinary {

    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    static class Solution {
        public boolean isBalance(TreeNode node) {
            return dfsHight(node) != -1;
        }

        public int dfsHight(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int left = dfsHight(node.left);
            if (left == -1) {
                return -1;
            }
            int right = dfsHight(node.right);
            if (right == -1) {
                return -1;
            }
            if (Math.abs(left - right) > 1) {
                return -1;
            }

            return 1 + (Math.max(left, right));
        }

    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(55);
        node.left.left=new TreeNode(0);

        Solution sol = new Solution();
        boolean ans=sol.isBalance(node);
        System.out.println(ans);
    }

}
