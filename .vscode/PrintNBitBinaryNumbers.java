import java.util.ArrayList;
import java.util.List;

public class PrintNBitBinaryNumbers {
    public static void solve(int one,int zero,int n,List<String> output)
    {
        if(n==0)
        {
            System.out.println(output);
            return;
        }
        List<String> op1=new ArrayList<>(output);
        op1.add("1");

        solve(one+1, zero, n-1, op1);

        if(one>zero)
        {
            List<String> op0=new ArrayList<>(output);
            op0.add("0");
            solve(one, zero+1, n-1, op0);
            return;
        }
    }
    public static void main(String[] args) {
        int n=3;
        int input=0;
        int output=0;

        List<String> list=new ArrayList<>();

        solve(input,output,n,list);
    }
    
}
