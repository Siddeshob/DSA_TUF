package TreeTUF;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversalOneStack {

    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    static class Solution {
        public List<Integer> postOrder(TreeNode curr) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>(); 
            while (curr != null || !stack.isEmpty()) {
                if (curr != null) {
                    stack.push(curr);
                    curr = curr.left;
                } else {
                    TreeNode temp = stack.peek().right;
                    if (temp == null) {
                        temp = stack.pop();
                        list.add(temp.val);
                        while (!stack.isEmpty() && temp == stack.peek().right) {
                            temp = stack.pop();
                            list.add(temp.val);
                        }
                    } else {
                        curr = temp;
                    }
                }

            }
            return list;

        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.left.right.right = new TreeNode(5);
        node.left.right.right.right = new TreeNode(6);

        node.right = new TreeNode(7);
        node.right.left = new TreeNode(8);

        Solution sol = new Solution();

        List<Integer> result = sol.postOrder(node);
        System.out.println(result);
    }

}
