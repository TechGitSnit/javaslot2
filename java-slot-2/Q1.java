import java.util.*;

// Linear  Search
class Q1
{
    public static void main(String ar[]) 
    {
        int[]  a=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elementzz");
        int i,f=0;
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("element to search");
        int n=sc.nextInt();
        for(i=0;i<a.length;i++)
        {
           if(a[i]==n)
           {
            f=1;
            break;
           }
        }
        if(f==0)
        {
            System.out.println("not found");
        }
        else{
            System.out.println("found at "+i);
        }
    }
}