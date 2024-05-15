package TreeTUF;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class TreeNode
{
    int data;
    TreeNode left,right;
    
    public TreeNode(int data)
    {
        this.data=data;
        left=right=null;
    }
}

class solve
{
    public static List<Integer> levelOrder(TreeNode node)
    {
        List<Integer> list=new ArrayList<>();
        if(node==null)
        {
            return list;
        }
        Stack<TreeNode> st=new Stack<>();
        st.push(node);
        while (!st.isEmpty())
        {
            node=st.pop();
            list.add(node.data);
            if(node.right!=null)
            {
                st.push(node.right);
            }
            if(node.left!=null)
            {
                st.push(node.left);
            }
        }
        return list;
    }
}

public class PreorderTravesal {
    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        node.left.left=new TreeNode(33);
        
        solve s=new solve();
        
        System.out.println(s.levelOrder(node));
    }
}
