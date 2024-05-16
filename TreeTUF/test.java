package TreeTUF;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class test {
    static class NodeTree {
        int val;
        NodeTree left, right;

        public NodeTree(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    static class Pair {
        NodeTree node;
        int state;

        public Pair(NodeTree node, int state) {
            this.node = node;
            this.state = state;
        }
    }
    static class Solution
    {
        public void AllinOne(NodeTree node)
        {
            Stack<Pair> stack=new Stack<>();
            List<Integer> preOrder=new ArrayList<>();
            List<Integer> inOrder=new ArrayList<>();
            List<Integer> postOrder=new ArrayList<>();

            if(node==null)
            {
                return;
            }
            stack.push(new Pair(node,1));
            while (!stack.isEmpty())
            {
                Pair pr=stack.pop();
                if(pr.state==1)
                {
                    preOrder.add(pr.node.val);
                    pr.state++;
                    stack.push(pr);

                    if(pr.node.left!=null)
                    {
                        stack.push(new Pair(pr.node.left,1));
                    }

                }
                else if(pr.state==2)
                {
                    inOrder.add(pr.node.val);
                    pr.state++;
                    stack.push(pr);

                    if(pr.node.right!=null)
                    {
                        stack.push(new Pair(pr.node.right,1));

                    }

                }
               else if(pr.state==3)
                {
                    postOrder.add(pr.node.val);
                }
                
            }
            System.out.println("preOrder : "+preOrder);
            System.out.println("inOrder : "+inOrder);
            System.out.println("postOrder : "+postOrder);
        }
    }

public static void main(String[] args) {
    NodeTree node=new NodeTree(1);
    node.left=new NodeTree(22);
    node.right=new NodeTree(3);
    node.left.left=new NodeTree(99);

    Solution sol=new Solution();
    sol.AllinOne(node);
    
}
}
