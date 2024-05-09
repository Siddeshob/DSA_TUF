package takeUforwardRecursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSumI {
    public static void sub(int arr[],int index,int sum,List<Integer> li)
    {
        if(index>arr.length-1)
        {
            li.add(sum);
            return;
        }
       
        sub(arr, index+1,sum+arr[index],li);
        
        sub(arr, index+1,sum,li);
    }

    public static void main(String[] args) {
        int[] arr={3,1,2};
        int sum=0;
        List<Integer> li=new ArrayList<>();
        sub(arr,0,sum,li);
        System.out.println("sort before "+li);
        Collections.sort(li);
        System.out.println(li);
    }
    
}
