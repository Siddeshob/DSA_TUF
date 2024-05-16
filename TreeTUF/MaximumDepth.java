package TreeTUF;

public class MaximumDepth {

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
        public int maximum(TreeNode root)
        {
            if(root==null)
            {
                return 0;
            }
            int left=maximum(root.left);
            int right=maximum(root.right);

            return 1+Math.max(left, right);
        }
    }
    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        node.left.left=new TreeNode(88);
        node.right.right=new TreeNode(99);
        node.right.right.right=new TreeNode(99);

        Solution sol=new Solution();
        int depth=sol.maximum(node);

        System.out.println(depth);
    }
    
}
