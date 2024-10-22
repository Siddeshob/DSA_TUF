package ArraysTUF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static boolean sort(int arr[])
    {
        for (int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i-1])
            {

            }
            else{
                return false;
            }
        }
        return true;
    }
    public static int largest(int arr[])
    {
        int num=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>num)
            {
                num=arr[i];
            }
        }

        return num;
    }
    public static int[] moveZero(int arr[])
    {
        int j=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        
        for(int i=j+1;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
    public static ArrayList removeDup(int arr[])
    {
        ArrayList<Integer> li=new ArrayList<>();
        for(int a:arr)
        {
           if(li.contains(a))
           {

           }else{
            li.add(a);
           }
        }

        return li;
    }
    public static int[] rotare(int arr[],int rot)
    {
        swap(arr,0,rot);
        swap(arr,rot+1,arr.length-1);
        swap(arr,0,arr.length-1);

        return arr;
    }
    public static void swap(int arr[],int start,int end)
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

    public static int secLarg(int arr[])
    {
        int l1=Integer.MIN_VALUE;
        int l2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>l1)
            {
                l2=l1;
                l1=arr[i];
            }
            else if(arr[i]>l2 && arr[i]<=l1)
            {
                l2=arr[i];
            }
        }
        return l2;
    }

    public static int secSmall(int a[])
    {
        int s1=Integer.MAX_VALUE;
        int s2=Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]<s1)
            {
                s2=s1;
                s1=a[i];
            }
            else if(a[i]<s2 && a[i]>s1)
            {
                s2=a[i];
            }
        }
        return s2;
    }








    public static void main(String[] args) {
        int arr[]={1,2,5};
        boolean ans=sort(arr);
        System.out.println(ans);

        System.out.println(largest(arr));
        int arr2[]={0,1,0,4,4,0,5,5};
        moveZero(arr2);
        for(int a:arr2)
        {
            System.out.print(a);
        }
        
        System.out.println();
        System.out.println(removeDup(arr2));

        int arr3[]={1,2,3,4,5};
        int rot=2-1;
        int[] ans4=rotare(arr3,rot);
        for(int a:ans4)
        {
            System.out.print(a);
        }
        
        System.out.println();
        System.out.println(secLarg(arr3));

        System.out.println();
        System.out.println(secSmall(arr3));

        
    }
    
}
