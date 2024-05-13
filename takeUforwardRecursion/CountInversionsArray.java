package takeUforwardRecursion;

import java.util.ArrayList;
import java.util.List;

public class CountInversionsArray {

    public static int merge(List<Integer> li, int first, int last, int mid) {
        int count=0;
        List<Integer> temp = new ArrayList<>();
        int left = first;
        int right = (mid + 1);
        while (left <= mid && right <= last) {
            if (li.get(left) <= li.get(right)) {
                temp.add(li.get(left));
                left++;
            } else {
                temp.add(li.get(right));
                count+=(mid-left+1);
                right++;
            }
        }
        
        while (left <= mid) {
            temp.add(li.get(left));
            left++;
        }
      
        while (right <= last) {
            temp.add(li.get(right));
            right++;
        }
       
        for (int i = first; i <= last; i++) {
            li.set(i, temp.get(i - first));
        }

       return count;
    }

    public static int solve(List<Integer> li, int first, int last) {
        if (first >= last) {
            return -1;
        }
        int mid = (first + last) / 2;

        solve(li, first, mid);
        solve(li, mid + 1, last);

        return merge(li, first, last, mid);

    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(3);
        li.add(2);
        li.add(1);
        li.add(4);

       int count= solve(li, 0, li.size() - 1);

       System.out.println(count);
       

    }

}
