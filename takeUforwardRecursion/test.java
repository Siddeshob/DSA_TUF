package takeUforwardRecursion;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void merge(List<Integer> li, int first, int last, int mid) {
        List<Integer> temp = new ArrayList<>();

        int left = mid + 1;

        while (first <= mid && left <= last) {
            if (li.get(first) <= li.get(mid)) {
                int get = li.get(first);
                temp.add(get);
                first++;
            } else {
                int get = li.get(left);
                temp.add(get);
                left++;
            }

        }
        while (first <= mid) {
            int get = li.get(first);
            temp.add(get);
            first++;
        }
        while (left <= last) {
            int get = li.get(left);
            temp.add(get);
            left++;
        }
        System.out.println("---"+temp);

        for (int i = first; i <= last; i++) { // Fix the loop to iterate from 'first' to 'last'
            li.set(i, temp.get(i - first));
        }
        System.out.println(li);
    }

    public static void solve(List<Integer> li, int first, int last) {
        if (first >= last) {
            return;
        }
        int mid = (first + last) / 2;

        solve(li, first, mid);
        solve(li, mid + 1, last);

        merge(li, first, last, mid);
    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(7);
        li.add(2);
        li.add(99);
        li.add(35);

        solve(li, 0, li.size() - 1);
    }

}
