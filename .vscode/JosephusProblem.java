import java.util.ArrayList;
import java.util.List;

public class JosephusProblem {
    public static int solve(List<Integer> li, int k, int index) {
        if (li.size() == 1) {
            return li.get(0);
        }
        index = (index + k) % li.size();
        li.remove(index);
        return solve(li, k, index);
    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int n = 5;
        int k = 2;
        int index = 0;
        k = k - 1;
        for (int i = 1; i <= n; i++) {
            li.add(i);
        }

        int result = solve(li, k, index);
        System.out.println("The last remaining person is: " + result);
    }
}