package TreeTUF;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
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
        public List<Integer> Bottom(TreeNode node) {
            List<Integer> ans = new ArrayList<>();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            Queue<Tuple> q = new LinkedList<>();

            if (node == null) {
                return ans;
            }

            q.offer(new Tuple(node, 0));

            while (!q.isEmpty()) {
                Tuple current = q.poll();
                TreeNode root = current.node;
                int col = current.col;

                map.put(col, root.val);

                if (root.left != null) {
                    q.offer(new Tuple(root.left, col - 1));
                }
                if (root.right != null) {
                    q.offer(new Tuple(root.right, col + 1));
                }
            }
            for (Map.Entry<Integer, Integer> m : map.entrySet()) {
                ans.add(m.getValue());
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);

        Solution sol = new Solution();
        List<Integer> ans = sol.Bottom(root);
        System.out.println(ans);
    }

}
