package TreeTUF;

public class DiameterofBinaryTree {
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
        public int DiameterTree(TreeNode node)
        {
            int[] diameter=new int[1];
            hight(diameter,node);
            return diameter[0];
        }
        public int hight(int[] diameter,TreeNode node)
        {
            if(node==null)
            {
                return 0;
            }
           int left= hight(diameter, node.left);
           int right=hight(diameter, node.right);
           diameter[0]=Math.max(diameter[0], left+right);

           return 1+Math.max(left,right);
        }
    }
    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        node.right.left=new TreeNode(4);
        node.right.left.left=new TreeNode(5);
        node.right.left.left.left=new TreeNode(9);

        node.right.right=new TreeNode(6);
        node.right.right.right=new TreeNode(7);
        node.right.right.right.right=new TreeNode(8);

        Solution sol=new Solution();
        int ans=sol.DiameterTree(node);
        System.out.println(ans);

    }
    
}
