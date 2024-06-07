package TreeTUF;

public class SymmetricalBinaryTrees {
    static class TreeNode
    {
        int val;
        TreeNode left,right;
        public TreeNode(int val)
        {
            this.val=val;
            this.left=this.right=null;
        }
    }
    static class Solution
    {
        public boolean Symmetrical(TreeNode node)
        {
            return node==null || isSymmetrical(node.left,node.right);
        }
        public boolean isSymmetrical(TreeNode left,TreeNode right)
        {
            if(left==null || right==null)
            {
               
                return left==right;
            }
            if(left.val!=right.val)
            {
                return false;
            }
            
            return isSymmetrical(left.left,right.right) && isSymmetrical(left.right,right.left);
        }
    }
    
    public static void main(String[] args) {
         TreeNode node=new TreeNode(0);
         node.left=new TreeNode(1);
         node.left.left=new TreeNode(2);
         node.right=new TreeNode(1);
         node.right.right=new TreeNode(2);

         Solution sol=new Solution();
        boolean ans= sol.Symmetrical(node);
        System.out.println(ans);
    }
}
