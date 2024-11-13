import java.util.*;
class Binary{
    public static void main(String ar[])
    {
        int[]  a=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elementzz");
        int i,m,s=0,e=a.length,f=0;
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter search elmnt");
        int el=sc.nextInt();

        while(s<=e)
        {
            m=(s+e)/2;

            if(el==a[m])
            {

                System.out.println("found at " +m+" index");
                f=1;
                break;
            }
            else if(e>a[m])
            {
                s=m+1;
            }
            else{
                e=m-1;

            }
        }


    }
}

