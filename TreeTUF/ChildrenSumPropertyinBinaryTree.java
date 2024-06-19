package TreeTUF;

public class ChildrenSumPropertyinBinaryTree {
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
        public void ChildrenSum(TreeNode node)
        {
            if(node==null) return;
            int child=0;

            if(node.left!=null) child+=node.left.val;
            if(node.right!=null) child+=node.right.val;

            if(child>node.val) node.val=child;
            else{
                if(node.left!=null) node.left.val=node.val;
                else if(node.right!=null) node.right.val=node.val;
            }
            ChildrenSum(node.left);
            ChildrenSum(node.right);

            int total=0;
            if(node.left!=null) total+=node.left.val;
            if(node.right!=null) total+=node.right.val;
            if(node.left!=null || node.right!=null) node.val=total;
        }
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(40);
        node.left = new TreeNode(10);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(5);
        node.right = new TreeNode(20);
        node.right.right = new TreeNode(40);
        node.right.left = new TreeNode(30);
    
        Solution sol = new Solution();
        sol.ChildrenSum(node); 
    
        // Visualize the tree structure
        visualizeTree(node, 0);
    }
    
    // Helper method to visualize the tree structure with indentation
    public static void visualizeTree(TreeNode node, int depth) {
        if (node == null) return;
        
        // Add indentation based on depth
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        
        // Print the node value
        System.out.println(node.val);
        
        // Recursively visualize left and right subtrees
        visualizeTree(node.left, depth + 1);
        visualizeTree(node.right, depth + 1);
    }
    
    
}
