package TreeTUF;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewOfBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    static class Solution {
        public List<Integer> RightView(TreeNode node) {

           List<Integer> ans= new ArrayList<>();
           solver(node, 0,ans);
           return ans;

        }

        public List<Integer> solver(TreeNode node, int col,List<Integer> ans) {

            if (node == null) {
                return ans;
            }
            
            if(col==ans.size())
            {
                ans.add(node.val);
            }
            solver(node.right, col+1,ans);
            solver(node.left, col+1,ans);
            
            return ans;
        }
    }

    public static void main(String[] args) {
        TreeNode node=new TreeNode(0);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        node.left.left=new TreeNode(4);
        node.left.right=new TreeNode(5);
        node.left.right.left=new TreeNode(6);
        node.right.right=new TreeNode(7);

        Solution sol=new Solution();
        List<Integer> ans=sol.RightView(node);
        System.out.println(ans);

    }

}
