package TreeTUF;

import java.util.List;

public class LowestCommonAncestor {
    static class TreeNode
    {
        int val;
        TreeNode left,right;

        public TreeNode(int val)
        {
            this.val=val;
            this.left=this.right;
        }
    }
    static class Solution {
        public TreeNode LowestCommon(TreeNode node)
        {
            
            return common(node,4,7);
        }
        public TreeNode common(TreeNode node,int p,int q)
        {
            if(node==null || p==node.val || q==node.val)
            {
                return node;
            }
            TreeNode left=common(node.left, p, q);
            TreeNode right=common(node.right, p, q);

            if(left==null)
            {
                return right;
            }
            else if(right==null)
            {
                return left;
            }
            else
            {
                return node;
            }
        }
        
    }
    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        node.right.left=new TreeNode(4);
        node.right.left.left=new TreeNode(8);
        node.right.right=new TreeNode(5);
        node.right.right.left=new TreeNode(6);
        node.right.right.right=new TreeNode(7);

        Solution sol=new Solution();
        TreeNode ans  =sol.LowestCommon(node);
        System.out.println(ans.val);
    }
    
}
