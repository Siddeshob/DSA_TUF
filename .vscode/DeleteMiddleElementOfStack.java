import java.util.Stack;

public class DeleteMiddleElementOfStack {

   
    public static void sort(Stack<Integer> stack,Integer k)
    {
        if(k==1)
        {
            stack.pop();
            return;
        }
        else
        {
            int temp=stack.peek();
            stack.pop();
            sort(stack, k-1);
            stack.push(temp);
        }
    }



    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        

        Integer k=(stack.size()/2)+1;

        sort(stack,k);

        System.out.println(stack.toString());
    }
    
}
