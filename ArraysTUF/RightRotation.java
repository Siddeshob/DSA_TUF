package ArraysTUF;

public class RightRotation {
    public static int[] rotate(int[] arr,int n)
    {
        swap(arr,0,n);
        swap(arr,n+1,arr.length-1);
        swap(arr,0,arr.length-1);

        return arr;
    }
    public static void swap(int[] arr,int start,int end)
    {
        while (start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=2;
        int ans[]=rotate(arr,n);

        for(int a:ans)
        {
            System.out.print(a+",");
        }
    }
    
}
