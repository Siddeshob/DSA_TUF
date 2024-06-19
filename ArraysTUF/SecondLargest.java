package ArraysTUF;

public class SecondLargest {

    public static int find(int arr[]) {
        int temp = arr[0];
        int sce = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sce && arr[i] < temp) {
                sce = arr[i];
            }
        }

        return sce;

    }

    private static int secondLargestNum(int[] arr) {

        int l1 = arr[0];
        int l2 = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l1) {
                l2 = l1;
                l1 = arr[i];
            } else if (arr[i] < l1 && arr[i] > l2) {
                l2 = arr[i];
            }
        }
        return l2;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 23, 8, 33, 5 };
        int ans = find(arr);
        int ans2 = secondLargestNum(arr);

        System.out.println(ans);
        System.out.println(ans2);
    }

}
