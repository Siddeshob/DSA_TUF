import java.util.ArrayList;
import java.util.List;

public class PermutationWithCaseChange {

    public static void solve(List<String> input,List<String> output)
    {
        if(input.isEmpty())
        {
            System.out.println(output);
            return;
        }
        else
        {
            String currentElement = input.get(0);

            List<String> op1 = new ArrayList<>(output);
            List<String> op2 = new ArrayList<>(output);

            op1.add(currentElement.toLowerCase());
            op2.add(currentElement.toUpperCase());

            input.remove(0);

            solve(input, op1);
            solve(input, op2);
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


// import java.util.ArrayList;
// import java.util.List;

// public class PermutationWithCaseChange {

//     public static void generatePermutations(List<String> input, int index, String current, List<String> result) {
//         // Base case: If we've processed all characters, add the current permutation to the result list
//         if (index == input.size()) {
//             result.add(current);
//             return;
//         }
        
//         // Generate permutations with the current character in lowercase
//         generatePermutations(input, index + 1, current + input.get(index).toLowerCase(), result);
        
//         // Generate permutations with the current character in uppercase
//         generatePermutations(input, index + 1, current + input.get(index).toUpperCase(), result);
//     }

//     public static void main(String[] args) {
//         List<String> input = new ArrayList<>();
//         input.add("a");
//         input.add("b");

//         List<String> result = new ArrayList<>();
//         generatePermutations(input, 0, "", result);

//         System.out.println(result);
//     }
// }

