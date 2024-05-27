package TreeTUF;

import java.util.ArrayList;
import java.util.List;

public class LeftViewOfBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    static class Solution {
        public List<Integer> LeftView(TreeNode node) {
            List<Integer> ans = new ArrayList<>();

            return solver(node, 0, ans);

        }

        public List<Integer> solver(TreeNode node, int row, List<Integer> ans) {
            if (node == null) {
                return ans;
            }
            if (row == ans.size()) {
                ans.add(node.val);
            }
            solver(node.left, row + 1, ans);
            solver(node.right, row + 1, ans);

            return ans;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(33);
        root.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(56);
        root.left.left.right.left = new TreeNode(67);

        Solution sol = new Solution();
        List<Integer> ans = sol.LeftView(root);
        System.out.println(ans);

    }

}
