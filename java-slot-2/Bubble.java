import java.util.*;
class Bubble
{
    public static void main(String ar[]) 
    {
        int[]  a=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elementzz");
        int i,j,t;
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
      
        for(i=0;i<a.length-1;i++)
        {
          for(j=0;j<a.length-i-1;j++)
          {
            if(a[j]<a[j+1])
            {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
          }
        }
      for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}