package takeUforwardRecursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionOnSubsequences {

    public static void solve(String s,int index,String current,List<String> li)
    {
        if(index==s.length())
        {
            li.add(current);
            System.out.println(li);
            return;
        } 
        solve(s, index+1, current+s.charAt(index), li);

        solve(s, index+1, current, li);

    }
    public static void main(String[] args) {
        String s="ab";
        int index=0;
        List<String> li=new ArrayList<>();

        solve(s,index,"",li);
    }
    
}
