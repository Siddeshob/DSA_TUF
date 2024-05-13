package takeUforwardRecursion;

import java.util.*;

class HelloWorld {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.next();
        int result = countSubstringsWithVowel(word);
        System.out.println("Total number of substrings containing at least one vowel: " + result);
    }

    public static int countSubstringsWithVowel(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String substring = word.substring(i, j);
                if (hasVowel(substring)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean hasVowel(String str) {
        return str.matches(".[aeiouAEIOU].");
    }
}