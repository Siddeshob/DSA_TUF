import java.util.ArrayList;
import java.util.List;

public class PrintSubsets {

    public static void solve(List<String> input, List<String> output) {
        if (input.size() == 0) {
            System.out.println(output);
            return;
        } else {
            // Create separate copies of the output list for each recursive call
            List<String> op1 = new ArrayList<>(output); // Copy of output list
            List<String> op2 = new ArrayList<>(output); // Copy of output list

            op2.add(input.remove(0));
            
            solve(input, op1);
            solve(input, op2);
            input.add(0, op2.get(op2.size() - 1)); // Restore input list
        }
    }

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("a");
        input.add("b");
       
       
        List<String> output = new ArrayList<>();

        solve(input, output);
    }
}
