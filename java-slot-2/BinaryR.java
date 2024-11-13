import java.util.*;

class BinaryR {

    // Recursive binary search function
    void biRecur(int[] a, int start, int end, int v) {
        // Base case: If start > end, the element is not found
        if (start > end) {
            System.out.println("Element not found");
            return;
        }

        int m = (start + end) / 2;  // Find middle index

        // If the middle element is the one we're searching for
        if (v == a[m]) {
            System.out.println("Found at index " + m);
        }
        // If the element is greater than the middle element, search in the right half
        else if (v > a[m]) {
            return biRecur(a, m + 1, end, v);  // Search in the right half (start is updated to m + 1)
        }
        // If the element is smaller than the middle element, search in the left half
        else {
            return biRecur(a, start, m - 1, v);  // Search in the left half (end is updated to m - 1)
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Initialize and populate the array
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements (sorted):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search:");
        int el = sc.nextInt();

        // Create an instance of BinaryRecur
        BinaryRecur br = new BinaryRecur();

        // Call the recursive binary search
        br.biRecur(a, 0, a.length - 1, el);  // Corrected the end index to a.length - 1


}
