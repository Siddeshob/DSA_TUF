package TreeTUF;

public class CheckTwoTreesAreIdentical {

    static class TreeNodeA {
        int val;
        TreeNodeA left, right;

        public TreeNodeA(int val) {
            this.val = val;
            this.left = right = null;
        }
    }

    static class TreeNodeB {
        int val;
        TreeNodeB left, right;

        public TreeNodeB(int val) {
            this.val = val;
            this.left = right = null;
        }
    }

    static class Solution {

        public boolean isSame(TreeNodeA p, TreeNodeB q) {
            if (p == null || q == null) {
                return p==q;;
            }
            return (p.val == q.val) && isSame(p.left, q.left) && isSame(p.right, q.right);
        }
    }

    public static void main(String[] args) {
        TreeNodeA p = new TreeNodeA(1);
        p.left = new TreeNodeA(2);
        p.right = new TreeNodeA(3);

        TreeNodeB q = new TreeNodeB(1);
        q.left = new TreeNodeB(2);
        q.right = new TreeNodeB(3);

        Solution sol = new Solution();
        boolean ans = sol.isSame(p, q);
        System.out.println(ans);

    }

}
