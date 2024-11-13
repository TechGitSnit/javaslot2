import java.util.*;
class Selection
{
  public static void main(String ar[])
  {
    int[] a=new int[5];
    int i,m,j,t;
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
		m=i;
		for(j=i+1;j<a.length;j++)
		{
	      if(a[j]<a[m])
	      {
			  m=j;
		  }
		}
		t=a[i];
		a[i]=a[m];
		a[m]=t;

	}
	 System.out.println("sorted elements are :");
		for(i=0;i<a.length;i++)
		{
		    System.out.println(a[i]);
	    }

  }
}