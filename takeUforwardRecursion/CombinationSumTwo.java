package takeUforwardRecursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSumTwo {

    public static void helper(int index,int target,int[] arr,List<List<Integer>> ans,List<Integer> ds)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(ds));
            
            return;
        }

        for(int i=index;i<arr.length;i++)
        {
            if(i>index && arr[i]==arr[i-1] )
            continue;
            if(arr[i]>target)
            break;

            ds.add(arr[i]);
            helper(i+1, target-arr[i], arr, ans, ds);
            ds.remove(ds.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] candidates ={1,1,1,2,2};
        int target=4;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,target,candidates,ans,new ArrayList<>());
        System.out.println(ans);
    }
    
}
