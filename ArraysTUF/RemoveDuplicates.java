package ArraysTUF;

public class RemoveDuplicates {
    public static int remove(int arr[])
    {
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,3,3};

        int ans=remove(arr);
        System.out.println(ans);
    }
    
}
