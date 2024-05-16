package TreeTUF;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderInorderPostorder {

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

    static class Solution {
        public void allInOne(NodeTree root) {
            Stack<Pair> stack = new Stack<>();
            List<Integer> preOrder = new ArrayList<>();
            List<Integer> inOrder = new ArrayList<>();
            List<Integer> postOrder = new ArrayList<>();

            if (root == null) return;

            stack.push(new Pair(root, 1));

            while (!stack.isEmpty()) {
                Pair it = stack.pop();

                if (it.state == 1) {
                    preOrder.add(it.node.val);
                    it.state++;
                    stack.push(it);

                    if (it.node.left != null) {
                        stack.push(new Pair(it.node.left, 1));
                    }
                } else if (it.state == 2) {
                    inOrder.add(it.node.val);
                    it.state++;
                    stack.push(it);

                    if (it.node.right != null) {
                        stack.push(new Pair(it.node.right, 1));
                    }
                } else if (it.state == 3) {
                    postOrder.add(it.node.val);
                }
            }

            System.out.println("Preorder: " + preOrder);
            System.out.println("Inorder: " + inOrder);
            System.out.println("Postorder: " + postOrder);
        }
    }

    public static void main(String[] args) {
        NodeTree node = new NodeTree(1);
        node.left = new NodeTree(2);
        node.right = new NodeTree(3);
        node.left.left = new NodeTree(4);
        node.left.right = new NodeTree(5);
        node.right.left = new NodeTree(6);
        node.right.right = new NodeTree(7);

        Solution sol = new Solution();
        sol.allInOne(node);
    }
}
