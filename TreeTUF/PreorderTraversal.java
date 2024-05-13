package TreeTUF;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Tree{
    int data;
    Tree left,right;

    public Tree(int data)
    {
        this.data=data;
    }
}
class Solution
{
    List<Integer> preOrder(Tree root)
    {
        List<Integer> ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        Stack<Tree> st=new Stack<>();
        st.push(root);
        while (! st.isEmpty())
        {
            root=st.pop();
            ans.add(root.data);
            if(root.right!=null)
            {
                st.push(root.right);
            }
            if(root.left!=null)
            {
                st.push(root.left);
            }
        }
        return ans;
    }
}

public class PreorderTraversal {
    public static void main(String[] args) {
        Tree data=new Tree(0);
        data.left=new Tree(1);
        data.right=new Tree(2);
        data.right.left=new Tree(3);
        data.right.right=new Tree(5);
        

        Solution sol =new Solution();

        System.out.println(sol.preOrder(data));
        
    }
    
}
