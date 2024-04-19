// base condition, hypothesis, induction
// it have 4 approch
// 1.recursive tree
// 2.base condition
// IBH :- Induction , base Condition , Hinduction 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecursionAdthyaVarma {

    private static void insert(List<Integer> li, int temp) {
        if (li.isEmpty() || li.get(0) >= temp) {
            li.add(0, temp);
        } else {
            int val = li.get(0);
            li.remove(0);
            insert(li, temp);
            li.add(0, val);
        }
    }

    private static void funSort(List<Integer> li) {
        if (li.size() <= 1) {
            return;
        }

        Integer temp = li.get(li.size() - 1);
        li.remove(li.size() - 1);
        funSort(li);
        insert(li, temp);
    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(0);
        li.add(1);
        li.add(5);
        li.add(2);

        funSort(li);

        // Printing the sorted list
        System.out.println("Sorted List:");
        for (Integer num : li) {
            System.out.print(num + " ");
        }
    }

}
