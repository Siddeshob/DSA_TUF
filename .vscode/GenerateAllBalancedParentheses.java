import java.util.ArrayList;
import java.util.List;

public class GenerateAllBalancedParentheses {

    public static List<String> check(int n)
    {
        List<String> result=new ArrayList<>();
        int open=n;
        int colse=n;
        List<String> output=new ArrayList<>();
        
        solve(open,colse,output,result);

        return result;
    }

    public static void solve(int open,int close,List<String> output,List<String> result)
    {
        if(open==0 && close==0)
        {
            result.add(String.join("", output));
            return;
        }
        if(open!=0)
        {
            List<String> op1=output;
           op1.add("(");

            solve(open-1, close, op1, result);
        }
        if(close>open)
        {
            List<String> op2=output;
            op2.add(")");

            solve(open, close-1, op2, result);
        }
        return;

    }
    public static void main(String[] args) {
        
        int n=3;
       
        System.out.println( check(n));
    }
    
}
