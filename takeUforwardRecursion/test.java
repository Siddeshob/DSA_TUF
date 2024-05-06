package takeUforwardRecursion;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static int pivot(int[] arr,int low,int high)
    {
        int p=arr[low];
        int i=low+1;
        int j=high;
        while (i<=j) 
        {
            while (i<=high && arr[i]<=p)
            {
                i++;
            }
            while (j>=low && arr[j]>p)
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;

    }

    public static void sort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int p=pivot(arr,low,high);
            sort(arr,low,p-1);
            sort(arr,p+1,high);
        }
    }
    
    public static void main(String[] args) {
       int arr[]={5,990,323,8,52,8,22,0};

       sort(arr,0,arr.length-1);

       for(int a:arr)
       {
        System.out.print(a+",");

       }
    }
}
