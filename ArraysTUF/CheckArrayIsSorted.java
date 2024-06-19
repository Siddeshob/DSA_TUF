package ArraysTUF;

public class CheckArrayIsSorted {
    public static void check(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>=arr[i-1])
            {
                
            }
            else
            {
                System.out.println("not sorteed");
            }
        }
        System.out.println(" sorteed");
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,60,9};
        check(arr);
    }
    
}
