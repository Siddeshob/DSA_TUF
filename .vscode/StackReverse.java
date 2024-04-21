import java.util.Stack;

public class StackReverse {

    public static void insert(Stack<Integer> stack,int temp)
    {
        if(stack.isEmpty())
        {
            stack.push(temp);
        }
        else
        {
            int val=stack.peek();
            stack.pop();
            insert(stack, temp);
            stack.push(val);
        }
    }
    public static void reverse(Stack<Integer> stack)
    {
        if(!stack.isEmpty())
        {
           int temp=stack.peek();
           stack.pop();
           reverse(stack);
           insert(stack,temp);
        }
       
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Before = "+stack.toString());

        reverse(stack);

        System.out.println("After = "+stack.toString());
    }
    
}
