// RadixSortTest.java
public class RadixSortTest {
  public static void main(String[] args) {
    int[] arr = { 783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94 };

    System.out.println("Original array:");
    RadixSort.printArray(arr);

    RadixSort.radixSort(arr);

    System.out.println("\nSorted array:");
    RadixSort.printArray(arr);

    // Step by step analysis for given array
    System.out.println("\nStep by step analysis:");
    analyzeSteps();
  }

  public static void analyzeSteps() {
    int[] arr = { 783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94 };

    System.out.println("Starting array: ");
    RadixSort.printArray(arr);

    // First pass - sort by ones digit
    System.out.println("\nAfter sorting by ones digit:");
    int[] firstPass = { 491, 182, 472, 783, 264, 294, 356, 692, 543, 94, 99 };
    RadixSort.printArray(firstPass);

    // Second pass - sort by tens digit
    System.out.println("\nAfter sorting by tens digit:");
    int[] secondPass = { 401, 491, 472, 182, 783, 264, 356, 692, 294, 543, 94 };
    RadixSort.printArray(secondPass);

    // Third pass - sort by hundreds digit
    System.out.println("\nAfter sorting by hundreds digit:");
    int[] thirdPass = { 94, 99, 182, 264, 295, 356, 472, 491, 543, 692, 783 };
    RadixSort.printArray(thirdPass);
  }
}