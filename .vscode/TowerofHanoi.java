public class TowerofHanoi {

    public static void slove(char s,char d,char h,int n)
    {
        if(n==1)
        {
            System.out.println("move plates "+n+" from "+s+" to "+d);
            return;
        }
        else
        {
            slove(s,h,d,n-1);
            System.out.println("moving plates "+n+" from "+s+" to "+d);
            slove(h,d,s,n-1);
            
        }
    }
    public static void main(String[] args) {
        int n=3;
        char s='a';
        char h='b';
        char d='c';
        

        slove(s,d,h,n);
       
        
    }
    
}
