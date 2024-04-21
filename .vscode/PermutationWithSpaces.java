import java.util.ArrayList;
import java.util.List;

public class PermutationWithSpaces{

    public static void solve(List<String> input,List<String> output)
    {
        if(input.size()==0)
        {
            System.out.println(output);
            return;
        }
        else
        {
            List<String> op1=new ArrayList<>(output);
            List<String> op2= new ArrayList<>(output);


            // op1.add(input.remove(0));
            // op2.add("-");
            // op1.add(input.remove(0));

            op1.add("-");
            op1.add(input.get(0));
            op2.add(input.get(0));

            input.remove(0);

            solve(input, op1);
            solve(input, op2);

            input.add(0,op2.get(op2.size()-1));

        }
    }
    public static void main(String[] args) {
        List<String> input=new ArrayList<>();
        input.add("a");
        input.add("b");
        input.add("c");
      
      
        List<String> output=new ArrayList<>();

        output.add(input.remove(0));

        solve(input,output);
        
    }
    
}
