import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public static List<String> letterCasePermutation(String input)
    {
        List<String> result=new ArrayList<>();
        if(input==null)
        {
            return result;
        }
        permute(input.toCharArray(),0,result);
        return  result;
    }
    public static void permute(char[] input,int index,List<String> result)
    {
        if(input.length==index)
        {
            result.add(new String(input));
            return;
           
        }
        if(Character.isLetter(input[index]))
        {
            input[index]=Character.toLowerCase(input[0]);
            permute(input, index+1, result);

            input[index]=Character.toUpperCase(input[0]);
            permute(input, index+1, result);
        }
        else
        {
            permute(input, index+1, result);
        }
    }

    public static void main(String[] args) {

        String s = "a1b2";
        List<String> li = letterCasePermutation(s);
        System.out.println(li);

    }

}
