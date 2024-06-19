package TreeTUF;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthofBinaryTree {
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
    static class Pair
    {
        TreeNode node;
        int num;
        public Pair(TreeNode node,int num)
        {
            this.node=node;
            this.num=num;
        }
    }
    static class Solution
    {
        public int  MaximumWidth(TreeNode node)
        {
            if(node==null) return 0;
            Queue<Pair> q=new LinkedList<>();
            int ans=0;
           
            q.offer(new Pair(node, 0));

            while (!q.isEmpty()) 
            {
                int size=q.size();
                int min=q.peek().num;
                int first=0,last=0;

                for(int i=0;i<size;i++)
                {
                    int curr=q.peek().num-min;
                    TreeNode root=q.peek().node;
                    q.poll();

                    if(i==0) first=curr;
                    if(i==size-1) last=curr;

                    if(root.left!=null)
                    {
                        q.offer(new Pair(root.left, curr*2+1));
                    }
                    if(root.right!=null)
                    {
                        q.offer(new Pair(root.right, curr*2+2));
                    }
                }
                ans=Math.max(ans, last-first+1);
            }
            return ans;
        }

    }
    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        node.left=new TreeNode(3);
        node.left.left=new TreeNode(8);
        node.right=new TreeNode(7);
        node.right.right=new TreeNode(4);

        Solution sol=new Solution();
        int ans=sol.MaximumWidth(node);
        System.out.println(ans);
    }
    
}
