package takeUforwardRecursion;

import java.util.ArrayList;
import java.util.List;

public class sunOfNs {

    public static void solve(int[] arr, int index, List<Integer> li, int sum) {
        if (arr.length == index) {
            if (sum == 2)
                System.out.print(li);
            return;
        }
        li.add(arr[index]);
        solve(arr, index + 1, li, sum = sum + arr[index]);

        li.remove(li.size() - 1);
        solve(arr, index + 1, li, sum = sum - arr[index]);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        List<Integer> li = new ArrayList<>();
        int index = 0;
        int sum = 0;

        solve(arr, index, li, sum);
    }

}
