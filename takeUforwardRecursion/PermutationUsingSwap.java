package takeUforwardRecursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationUsingSwap {

    public static void solve(int index,int[] arr,List<List<Integer>> ans)
    {
        
        if(index==arr.length)
        {
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<arr.length;i++)
            {
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index;i<arr.length;i++)
        {
            swap(i,index,arr);
            solve(index+1, arr, ans);
            swap(i,index,arr);
        }
    }
    public static void swap(int i,int j, int[] arr)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void main(String[] args) {
        int []arr={1,2,3};

        List<List<Integer>> ans=new ArrayList<>();
        solve(0,arr,ans);

        System.out.println(ans);
    }
}
