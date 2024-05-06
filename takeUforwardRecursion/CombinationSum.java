package takeUforwardRecursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    private static void combine(int index, int target, int[] arr, List<List<Integer>> ans, ArrayList ds) {

        if(index==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[index]<=target)
        {
            ds.add(arr[index]);
            combine(index, target-arr[index], arr, ans, ds);
            ds.remove(ds.size()-1);
        }
        combine(index+1, target, arr, ans, ds);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        combine(0, target, arr, ans, new ArrayList<>());
        System.out.println(ans);
    }

}
