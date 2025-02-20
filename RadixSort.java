// RadixSort.java
public class RadixSort {
  // Method to get maximum value in arr[]
  private static int getMax(int arr[]) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
    }
    return max;
  }

  // A function to do counting sort of arr[] according to
  // the digit represented by exp.
  private static void countSort(int arr[], int exp) {
    int n = arr.length;
    int output[] = new int[n];
    int count[] = new int[10];

    // Store count of occurrences in count[]
    for (int i = 0; i < n; i++)
      count[(arr[i] / exp) % 10]++;

    // Change count[i] so that count[i] now contains
    // actual position of this digit in output[]
    for (int i = 1; i < 10; i++)
      count[i] += count[i - 1];

    // Build the output array
    for (int i = n - 1; i >= 0; i--) {
      output[count[(arr[i] / exp) % 10] - 1] = arr[i];
      count[(arr[i] / exp) % 10]--;
    }

    // Copy the output array to arr[], so that arr[] now
    // contains sorted numbers according to current digit
    for (int i = 0; i < n; i++)
      arr[i] = output[i];
  }

  // The main function to sort arr[] using Radix Sort
  public static void radixSort(int arr[]) {
    // Find the maximum number to know number of digits
    int m = getMax(arr);

    // Do counting sort for every digit
    for (int exp = 1; m / exp > 0; exp *= 10)
      countSort(arr, exp);
  }

  // Utility function to print an array
  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}