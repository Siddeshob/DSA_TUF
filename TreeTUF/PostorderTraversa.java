package TreeTUF;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class PostorderTraversa {

   static class TreeNode {
        int val;
        TreeNode left, right;
    
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    static class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> st1 = new Stack<>();
            Stack<TreeNode> st2 = new Stack<>();

            if (root == null) {
                return list;
            }
            st1.push(root);
            while (!st1.isEmpty()) {

                root = st1.pop();
                st2.push(root);
                
                if (root.left != null) {
                    st1.push(root.left);
                }
                if (root.right != null) {
                    st1.push(root.right);
                }
            }
            while(!st2.isEmpty())
            {
                list.add(st2.pop().val);
            }
            return list;
        }
    }

    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);

        Solution sol = new Solution();

        System.out.println(sol.postorderTraversal(node));
    }

}
