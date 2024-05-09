package takeUforwardRecursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PrintAllPermutations {

    public static void solve(List<Integer> ds, int[] arr, List<List<Integer>> ans, boolean[] fre) {
        if (ds.size() == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!fre[i]) {
                fre[i] = true;
                ds.add(arr[i]);
                solve(ds, arr, ans, fre);
                ds.remove(ds.size() - 1);
                fre[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3,5 };
        List<List<Integer>> ans = new ArrayList<>();

        boolean[] fre = new boolean[arr.length];

        solve(new ArrayList<Integer>(), arr, ans, fre);
        System.out.println(ans);
    }

}
