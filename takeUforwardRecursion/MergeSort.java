package takeUforwardRecursion;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void merge(List<Integer> list, int low, int high, int mid) {
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;
        System.out.println("-------------------------------- ");
        System.out.println("temp - "+temp);

        while (left <= mid && right <= high) {
            if (list.get(left) <= list.get(right)) {
                temp.add(list.get(left));
                System.out.println("true - "+temp);
                left++;
            } else {
                temp.add(list.get(right));
                System.out.println("false - "+temp);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(list.get(left));
            System.out.println("left - "+temp);
            left++;
        }
        while (right <= high) {
            temp.add(list.get(right));
            System.out.println("right - "+temp);
            right++;
        }
        for (int i = low; i <= high; i++) {
            list.set(i, temp.get(i - low));
            System.out.println("temp - "+temp+" list - " +list);
        }
        System.out.println(list);
    }

    public static void solve(List<Integer> list, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        solve(list, low, mid);
        solve(list, mid + 1, high);

        merge(list, low, high, mid);
    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(6);
        li.add(2);
        li.add(9);
        li.add(44);
        li.add(2);

        solve(li, 0, li.size() - 1);
    }

}
