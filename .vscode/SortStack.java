import java.util.Iterator;
import java.util.Stack;

public class SortStack {

    public static void insert(Stack<Integer> stack, Integer temp) {
        if (stack.isEmpty() || stack.peek() <=temp) {
            

            stack.push(temp);
        } else {
            Integer val = stack.peek();
            stack.pop();
            insert(stack, temp);
            
            stack.push(val);
            
        }
    }

    public static void sort(Stack<Integer> stack) {
        if (stack.size() <= 1) {
            return;
        } else {
            Integer temp = stack.peek();
            stack.pop();
            sort(stack);
            insert(stack, temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(0);
        st.push(5);
        // st.push(2);

        sort(st);

        System.out.println(st.toString());
    }
}
