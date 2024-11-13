import java.util.*;
class Insertion
{
  public static void main(String ar[])
  {
    int[] a=new int[5];
    int i,k,j;
    Scanner ob=new Scanner(System.in);
    System.out.println("eneter the elements ");
    for(i=0;i<a.length;i++)
    {
		a[i]=ob.nextInt();
	}
	 System.out.println("enetered elements are ");
	for(i=0;i<a.length;i++)
	{
	    System.out.println(a[i]);
	}

   	for(i=0;i<a.length;i++)
   	{
			k=a[i];
			j=i-1;
			while(j>=0&& k<a[j])
			{
					a[j+1]=a[j];
					j=j-1;
			}
			a[j+1]=k;

	}

 System.out.println("sorted elements are ");
		for(i=0;i<a.length;i++)
		{
		    System.out.println(a[i]);
	    }

  }
}