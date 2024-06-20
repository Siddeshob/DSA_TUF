package ArraysTUF;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {
    public static int[] unionArray(int a1[],int a2[],int n1,int n2)
    {
        int i=0,j=0;
        List<Integer> union=new ArrayList<>(); 
        while (i<n1 && j<n2)
        {
            if(a1[i]<a2[j])
            {
                if(union.size()==0 ||union.get(union.size()-1)!=a1[i])
                {
                    union.add(a1[i]);
                }
                else
                {
                    if(union.size()==0 || union.get(union.size()-1)!=a2[j])
                    {
                        union.add(a2[i]);
                    }
                }
            }
            
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3,4,5,6};

        unionArray(arr1,arr2,arr1.length,arr2.length);
    }
    
}
