package TreeTUF;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderTraversal {

    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    static class Tuple {
        TreeNode node;
        int row;
        int col;

        public Tuple(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    static class Solution {
        public List<List<Integer>> verticalTraversal(TreeNode root) {
            TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
            Queue<Tuple> q = new LinkedList<>();
            q.offer(new Tuple(root, 0, 0));
            
            while (!q.isEmpty()) {
                Tuple current = q.poll();
                TreeNode node = current.node; 
                int x = current.row;
                int y = current.col;
    
                if (!map.containsKey(x)) {
                    map.put(x, new TreeMap<>());
                }
                if (!map.get(x).containsKey(y)) {
                    map.get(x).put(y, new PriorityQueue<>());
                }
                map.get(x).get(y).offer(node.val);
                
                if (node.left != null) {
                    q.offer(new Tuple(node.left, x - 1, y + 1));
                }
                if (node.right != null) {
                    q.offer(new Tuple(node.right, x + 1, y + 1));
                }
            }
            
            List<List<Integer>> ans = new ArrayList<>();
            for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
                List<Integer> vertical = new ArrayList<>();
                for (PriorityQueue<Integer> nodes : ys.values()) {
                    while (!nodes.isEmpty()) {
                        vertical.add(nodes.poll());
                    }
                }
                ans.add(vertical);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.left.left = new TreeNode(4);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);

        Solution sol = new Solution();
        List<List<Integer>> result = sol.verticalTraversal(node);
        System.out.println(result); // Expected Output: [[4], [9], [3, 15], [20], [7]]
    }
}
