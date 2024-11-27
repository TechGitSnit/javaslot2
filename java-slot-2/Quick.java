import java.util.*;

public class Quick {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter a limit");
        int l = ob.nextInt();
        int[] a = new int[l];

        System.out.println("Enter a elemnts");
        for (int i = 0; i < l; i++) {
            a[i] = ob.nextInt();
        }

        quickSort(a, 0, l - 1);

        for (int v : a) {
            System.out.println(v);
        }
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            
            int pivotIndex=partition(a,low,high);

            quickSort(a, low, pivotIndex-1);
            quickSort(a, pivotIndex+1, high);

           
        }
    }

    public static int partition(int[] a, int low, int high) {
        int pivot=a[high];
        int i=low-1;


        for (int j = 0; j < high; j++) {
            i++;
            if(a[j]<pivot)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

            //swap the pivot index

        }
        int t=a[i+1];
        a[i+1]=a[high];
        a[high]=t;

        return i+1;
       
    }
        
    
}
