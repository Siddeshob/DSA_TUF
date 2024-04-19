import java.util.Arrays;

public class Recursion {

    private static String name(int i, int n) {

        if (i > n) {
            return "end";
        } else
            System.out.println("Siddu");

        return name(i + 1, n);
    }

    public static int linearly(int i, int n) {

        if (i > n) {
            return n;
        } else
            i++;
        System.out.println(i - 1);
        return linearly(i, n);
    }

    public static int revOrder(int i, int n) {
        if (n == i) {
            return n;
        } else
            n--;
        System.out.println(" - " + n);
        return revOrder(i, n);
    }

    public static void BackTrace(int i, int n) {
        if (i < 1) {
            return;
        } else {

            BackTrace(i - 1, n); // Recur with the next element
            System.out.println(i);
        }
    }

    public static void BackTraceTopBottom(int i, int n) {
        if (i <= n) {
            BackTraceTopBottom(i + 1, n);
            System.out.println("=" + i);
        }
    }

    public static int sumOfN(int n) {
        if (n == 0) {
            return n;
        } else
            return n + sumOfN(n - 1);
    }

    public static int[] printNos(int x) {
        if (x <= 0) {
            return new int[0];
        } else {
            int[] result = printNos(x - 1); // Recursively call printNos with x-1
            int[] newArray = new int[result.length + 1]; // Create a new array with increased length
            System.arraycopy(result, 0, newArray, 0, result.length); // Copy the elements from result to newArray
            newArray[result.length] = x; // Add x at the end of newArray
            return newArray;
        }
    }

    public static int Factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * Factorial(n - 1);
        }
    }

    public static void RevArray(int i, int arr[], int n) {
        if (i > n / 2) {
            return;
        } else {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;

            RevArray(i + 1, arr, n);
        }
    }

    public static void palindrome(int i, String s, int n) {
        if (i > n / 2) {
            System.out.println("is not palindrome");
            return;
        } else {
            if (s.charAt(i) == s.charAt(n - i - 1)) {
                System.out.println("is palindrome");
                return;
            }
            palindrome(i + 1, s, n);
        }
    }

    public static int fibo(int n) {
        // fib(5)=fib(4)+fib(3);
        if (n <= 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {

        // printing name n times uding recursion
        // System.out.println(name(1, 5));

        // System.out.println(linearly(1, 5));

        // System.out.println(revOrder(1, 5));

        // BackTrace(5, 5);
        // BackTraceTopBottom(1,5);

        // System.out.println("sum = "+sumOfN(3));

        // System.out.println("printNos sum = "+printNos(3));

        // System.out.println(" Factorial = "+Factorial(4));
        // ---------------------------------------------------------------------------------------------
        // int arr[] = { 1, 2, 3, 4, 5 };

        // System.out.println("Before = " + Arrays.toString(arr));

        // RevArray(0, arr, arr.length);

        // System.out.println("after = " + Arrays.toString(arr));

        // ---------------------------------------------------------------------------------------------

        // String s="sos";
        // palindrome(0,s,s.length());

        System.out.println("Fibonoci num = " + fibo(6));

    }

}
