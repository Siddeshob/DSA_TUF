package ArraysTUF;

public class SecondSmallest {
    public static int small(int arr[])
    {
        int sm1=Integer.MAX_VALUE;
        int sm2=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<sm1)
            {
                sm2=sm1;
                sm1=arr[i];
            }
            else if(arr[i]!=sm1 && arr[i]<sm2)
            {
                sm2=arr[i];
            }
        }

        return sm1;
    }
    public static void main(String[] args) {
        int arr[]={7,32,9,32,5,3,3,78,2};
       int ans= small(arr);

       System.out.println(ans);
    }
    
}
