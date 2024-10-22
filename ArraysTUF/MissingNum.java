package ArraysTUF;

public class MissingNum {
    public static int miss(int[] arr)
    {
        int sum=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            sum2+=i;
        }
        int isSum=(arr.length*(arr.length+1))/2;

        return Math.abs(isSum-sum2);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,9};
        int ans=miss(arr);
        System.out.println(ans);
    }
    
}
