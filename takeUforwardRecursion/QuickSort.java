package takeUforwardRecursion;

public class QuickSort {
    public static int findPivot(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low + 1; // Corrected the initialization
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] <= pivot) { // Corrected the condition
                i++;
                System.out.println("increment i ");
            }
            while (j >= low + 1 && arr[j] > pivot) { // Corrected the condition
                j--;
                System.out.println("decrement j ");
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.println("arr[j]= " + arr[j] + " temp= " + temp);

            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        System.out.println("outside - \n");
        
        for (int a : arr) {
            System.out.print(a + "/");
        }
        System.out.println("j= "+j);
        return j;
    }

    public static void quickSortDo(int arr[], int low, int high) {
        if (low < high) {

            int pivot = findPivot(arr, low, high);
            System.out.println("\n");
            for (int a : arr) {
                System.out.print(a + "-");
            }

            quickSortDo(arr, low, pivot - 1);
            System.out.println("\n");
            for (int a : arr) {
                System.out.print(a + "*");
            }
            quickSortDo(arr, pivot + 1, high);
            System.out.println("\n");
            for (int a : arr) {
                System.out.print(a + "#");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 9, 1, 3 };

        quickSortDo(arr, 0, arr.length - 1);

        System.out.println();
        for (int a : arr) {
            System.out.print(a + ",");
        }
    }

}
