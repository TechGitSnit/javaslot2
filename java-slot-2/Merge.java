import java.util.*;

public class Merge {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter a limit");
        int l = ob.nextInt();
        int[] a = new int[l];

        System.out.println("Enter a elemnts");
        for (int i = 0; i < l; i++) {
            a[i] = ob.nextInt();
        }

        mergeSort(a, 0, l - 1);

        for (int v : a) {
            System.out.println(v);
        }
    }

    public static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int m = (left + right) / 2;

            mergeSort(a, left, m);
            mergeSort(a, m + 1, right);
            mergeSortA(a, left, m, right);
        }
    }

    public static void mergeSortA(int[] a, int left, int m, int right) {
        int n1 =  m -left+ 1;
        int n2 = right - m;

        int lA[] = new int[n1];
        int rA[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            lA[i] = a[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rA[j] = a[m + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (lA[i] <= rA[j]) {
                a[k] = lA[i];
                i++;
            } else {
                a[k] = rA[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            a[k] = lA[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k] = rA[j];
            j++;
            k++;
        }

    }
}
