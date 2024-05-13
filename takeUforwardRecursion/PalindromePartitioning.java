package takeUforwardRecursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static boolean isPalindrome(String s, int first, int last) {
        while (s.charAt(first) != s.charAt(last)) {
            System.out.println("fail at - "+first+" - "+last);
            return false;
        }
        first++;
        last++;
        System.out.println("pass at - "+first+" - "+last);
        return true;
    }

    public static void solve(int index, String s, List<List<String>> ans, List<String> ds) {
        if (index == s.length()) {
            ans.add(new ArrayList<>(ds));
            System.out.println(ds);
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                ds.add(s.substring(index, i + 1));
                System.out.println(i+" i "+index+" index   - "+ds+"\n");
                solve(i + 1, s, ans, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String s = "aabb";
        List<List<String>> ans = new ArrayList<>();

        solve(0, s, ans, new ArrayList<String>());
        System.out.println(ans);
    }

}
