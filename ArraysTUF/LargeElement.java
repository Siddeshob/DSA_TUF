package ArraysTUF;

public class LargeElement {
    public static void main(String[] args) {
        int[] arr = {34, 56, 78, 012, 12 ,99,42};
        int temp=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>temp)
            {
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }

}
