package TreeTUF;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagSpiralTraversal {

    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public List<List<Integer>> zig(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> ans = new ArrayList<>();
            boolean flage = false;
            if (root == null) {
                return ans;
            }
            queue.add(root);
            while (!queue.isEmpty()) {
                int n = queue.size();
                List<Integer> sub = new ArrayList<>(n);
                for (int i = 0; i < n; i++) {
                    TreeNode current = queue.poll();
                    if (flage) {
                        sub.add(0, current.val);  // Insert at the beginning for reverse order
                    } else {
                        sub.add(current.val);     // Insert at the end for normal order
                    }
                    if (current.left != null) {
                        queue.offer(current.left);
                    }
                    if (current.right != null) {
                        queue.offer(current.right);
                    }
                }
                flage = !flage;
                ans.add(sub);
            }
            return ans;
        }
        

    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);

        Solution sol = new Solution();
        List<List<Integer>> ans = sol.zig(node);
        System.out.println(ans);
    }

}
