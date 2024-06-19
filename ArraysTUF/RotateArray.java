package ArraysTUF;

public class RotateArray {

    public static int[] rotate(int[] arr, int n) {
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        for (int i = n; i < arr.length; i++) {
            arr[i - n] = arr[i];
            System.out.println("-->" + arr[i]);
        }

        for (int i = arr.length - n; i < arr.length; i++) {
            arr[i] = temp[i - (arr.length - n)];

        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = 3;

        int ans[] = rotate(arr, n);
        for (int a : ans) {
            System.out.println(a);
        }

    }

}
