// RadixSortTest.java
/**
 * This class tests our RadixSort implementation with the required array
 */
public class RadixSortTest {
  public static void main(String[] args) {
    // Create our test array with the required numbers
    int[] numbersToSort = { 783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94 };

    // Print the original array
    System.out.println("Original array before sorting:");
    RadixSort.printArray(numbersToSort);

    // Sort the array using our RadixSort implementation
    System.out.println("\nStarting the Radix Sort process...");
    RadixSort.radixSort(numbersToSort);

    // Print the final sorted array
    System.out.println("\nFinal sorted array:");
    RadixSort.printArray(numbersToSort);

    // Print detailed explanation of what happened
    System.out.println("\nDetailed Explanation of the Sorting Process:");
    System.out.println("1. We started with the array: 783 99 472 182 264 543 356 295 692 491 94");
    System.out.println("2. First, we sorted by the ones digit (last digit of each number)");
    System.out.println("3. Then, we sorted by the tens digit (second to last digit)");
    System.out.println("4. Finally, we sorted by the hundreds digit");
    System.out.println("5. The result is a fully sorted array from smallest to largest number");
  }
}