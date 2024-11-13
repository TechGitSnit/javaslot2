import java.util.*;
class BinaryRecur
{

	void  biRecur(int[] a,int start,int end,int v)
	{
		int m;



        if(start<=end)
        {
            m=(start+end)/2;

            if(v==a[m])
            {
                System.out.println("found at " +m+" index");

            }
            else if(v<a[m])
            {
                biRecur(a,start,m-1,v);
            }
            else
			{
                 biRecur(a,m+1,end,v);

            }
        }
	}
    public static void main(String ar[])
    {
        int[]  a=new int[5];
        Scanner sc=new Scanner(System.in);
		int i;

		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
        System.out.println("Enter the value");
        int el =sc.nextInt();
		BinaryRecur br=new BinaryRecur();
		br.biRecur(a,0,a.length,el);
    }
}

