package ArraysTUF;

public class MoveZerosToEnd {
    public static int[] move(int arr[]) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return arr;

        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        int arr[] = { 1, 9, 0, 3, 7, 0, 0, 34, 0, 3, 0 };
        int ans[]=move(arr);
        for(int a:ans)
        {
            System.out.print(a+",");
        }
    }

}
