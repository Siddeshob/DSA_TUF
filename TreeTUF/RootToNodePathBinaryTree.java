package TreeTUF;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RootToNodePathBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    static class Solution {
        public List<Integer> RootToNode(TreeNode node) {
            List<Integer> ds = new ArrayList<>();
            int target = 4;
            if (node == null) {
                return ds;
            }
            solutions(node, ds, target);
            return ds;
        }

        public boolean solutions(TreeNode node, List<Integer> ds, int target) {
            if (node == null) {
                return false;
            }
            ds.add(node.val);
            if (node.val == target) {
                return true;
            }
            if (solutions(node.left, ds, target) || solutions(node.right, ds, target)) {
                return true;
            }
            ds.remove(ds.size() - 1);
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.right = new TreeNode(4);

        Solution sol = new Solution();
        List<Integer> ans = sol.RootToNode(node);
        System.out.println(ans);
    }

}
