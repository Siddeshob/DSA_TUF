package takeUforwardRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSumII {

    public static void sub(int index,int[] arr,List<List<Integer>> ans,List<Integer> ds)
    {
        ans.add(new ArrayList<>(ds));

        for(int i=index;i<arr.length;i++)
        {
            if(i!=index && arr[i]==arr[i-1])
            {
                continue;
            }
            ds.add(arr[i]);
            sub(i+1,arr,ans,ds);
            ds.remove(ds.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,2};
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();

        sub(0,arr,ans,new ArrayList<>());
        System.out.println(ans);
    }
    
}
