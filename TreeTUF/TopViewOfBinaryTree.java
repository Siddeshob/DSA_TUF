package TreeTUF;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    static class Tuple {
        TreeNode node;
        int col;

        public Tuple(TreeNode node, int col) {
            this.node = node;
            this.col = col;
        }
    }

    static class Solution {
        public List<Integer> TopView(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            Queue<Tuple> q = new LinkedList<>();
            TreeMap<Integer, Integer> map = new TreeMap<>();

            if (root == null) {
                return ans;
            }

            q.offer(new Tuple(root, 0));

            while (!q.isEmpty()) {
                Tuple t = q.poll();
                TreeNode node = t.node;
                int col = t.col;

                if (!map.containsKey(col)) {
                    map.put(col, node.val);
                }
                if (node.left != null) {
                    q.offer(new Tuple(node.left, col - 1));
                }
                if (node.right != null) {
                    q.offer(new Tuple(node.right, col + 1));
                }
            }

            for (int val : map.values()) {
                ans.add(val);
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);

        Solution sol = new Solution();
        List<Integer> result = sol.TopView(root);
        System.out.println("Top View: " + result);
    }
}
