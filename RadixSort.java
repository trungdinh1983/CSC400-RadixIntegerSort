/**
 * This class implements the Radix Sort algorithm to sort an array of integers.
 * Radix Sort works by sorting numbers digit by digit, starting from the least
 * significant digit (rightmost)
 * to the most significant digit (leftmost).
 */
public class RadixSort {

  /**
   * Finds the largest number in the array to determine how many digits we need to
   * process
   * 
   * @param arrayToSort The array we want to find the maximum number from
   * @return The largest number in the array
   */
  private static int findLargestNumber(int[] arrayToSort) {
    // Start by assuming the first number is the largest
    int largestNumber = arrayToSort[0];

    // Go through each number in the array
    for (int currentIndex = 1; currentIndex < arrayToSort.length; currentIndex++) {
      // If we find a bigger number, update largestNumber
      if (arrayToSort[currentIndex] > largestNumber) {
        largestNumber = arrayToSort[currentIndex];
      }
    }

    return largestNumber;
  }

  /**
   * Sorts the array based on a specific digit position
   * 
   * @param arrayToSort   The array we want to sort
   * @param digitPosition Which digit position we're currently sorting (1s, 10s,
   *                      100s, etc.)
   */
  private static void sortByDigit(int[] arrayToSort, int digitPosition) {
    // Create arrays we need for sorting
    int arrayLength = arrayToSort.length;
    int[] resultArray = new int[arrayLength]; // Will hold the sorted numbers
    int[] digitCount = new int[10]; // Counts how many times each digit (0-9) appears

    // Step 1: Count how many times each digit appears
    for (int i = 0; i < arrayLength; i++) {
      // Extract the current digit we're looking at
      int currentDigit = (arrayToSort[i] / digitPosition) % 10;
      // Increment the count for this digit
      digitCount[currentDigit]++;
    }

    // Step 2: Calculate the correct positions for each digit
    // Add each count to the previous counts
    for (int digit = 1; digit < 10; digit++) {
      digitCount[digit] += digitCount[digit - 1];
    }

    // Step 3: Build the sorted array
    // Go through the original array from right to left
    for (int i = arrayLength - 1; i >= 0; i--) {
      // Get the current digit
      int currentDigit = (arrayToSort[i] / digitPosition) % 10;
      // Place the number in its correct position
      resultArray[digitCount[currentDigit] - 1] = arrayToSort[i];
      // Decrease the count for this digit
      digitCount[currentDigit]--;
    }

    // Step 4: Copy the sorted results back to the original array
    for (int i = 0; i < arrayLength; i++) {
      arrayToSort[i] = resultArray[i];
    }

    // Print the array after sorting by this digit
    System.out.println("\nAfter sorting by digit position " + digitPosition + ":");
    printArray(arrayToSort);
  }

  /**
   * The main radix sort method that sorts the entire array
   * 
   * @param arrayToSort The array we want to sort
   * @throws IllegalArgumentException if the array is null or empty
   */
  public static void radixSort(int[] arrayToSort) {
    // Validate input array is not null or empty
    if (arrayToSort == null) {
      throw new IllegalArgumentException("Array cannot be null");
    }

    if (arrayToSort.length == 0) {
      throw new IllegalArgumentException("Array cannot be empty");
    }

    // Find the largest number to know how many digits we need to process
    int largestNumber = findLargestNumber(arrayToSort);

    // Sort for each digit position (1s, 10s, 100s, etc.)
    for (int digitPosition = 1; largestNumber / digitPosition > 0; digitPosition *= 10) {
      sortByDigit(arrayToSort, digitPosition);
    }
  }

  /**
   * Prints the array in a readable format
   * 
   * @param arrayToPrint The array we want to display
   */
  public static void printArray(int[] arrayToPrint) {
    for (int number : arrayToPrint) {
      System.out.print(number + " ");
    }
    System.out.println(); // Print a new line after the array
  }
}