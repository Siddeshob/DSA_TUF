package ArraysTUF;

public class MaxConsitiveOnes {

    private static int max(int[] arr) {

        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;

            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 4, 1, 1, 1, 4, 1, 6, 1, 1, 1, 1, 1, 1, 2 };

        System.out.println(max(arr));
    }

}
