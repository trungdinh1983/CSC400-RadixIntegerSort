import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test class for the RadixSort implementation
 */
public class RadixSortTest {

  private int[] testArray;
  private int[] expectedSortedArray;

  @BeforeEach
  public void setUp() {
    // Initialize the test array with the required numbers before each test
    testArray = new int[] { 783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94 };
    expectedSortedArray = new int[] { 94, 99, 182, 264, 295, 356, 472, 491, 543, 692, 783 };
  }

  @Test
  @DisplayName("Test radix sort with provided array")
  public void testRadixSortWithProvidedArray() {
    // Print original array for clarity
    System.out.println("Original array before sorting:");
    RadixSort.printArray(testArray);

    // Sort the array
    RadixSort.radixSort(testArray);

    // Print sorted array
    System.out.println("\nFinal sorted array:");
    RadixSort.printArray(testArray);

    // Assert that the array is sorted correctly
    assertArrayEquals(expectedSortedArray, testArray, "Array should be sorted in ascending order");
  }

  @Test
  @DisplayName("Test radix sort with single element array")
  public void testRadixSortWithSingleElement() {
    int[] singleElementArray = { 42 };
    RadixSort.radixSort(singleElementArray);
    assertEquals(42, singleElementArray[0], "Single element array should remain unchanged");
  }

  @Test
  @DisplayName("Test radix sort with already sorted array")
  public void testRadixSortWithSortedArray() {
    int[] sortedArray = { 1, 2, 3, 4, 5 };
    int[] expectedArray = { 1, 2, 3, 4, 5 };

    RadixSort.radixSort(sortedArray);
    assertArrayEquals(expectedArray, sortedArray, "Already sorted array should remain sorted");
  }

  @Test
  @DisplayName("Test radix sort with reverse sorted array")
  public void testRadixSortWithReverseSortedArray() {
    int[] reverseSortedArray = { 5, 4, 3, 2, 1 };
    int[] expectedArray = { 1, 2, 3, 4, 5 };

    RadixSort.radixSort(reverseSortedArray);
    assertArrayEquals(expectedArray, reverseSortedArray, "Reverse sorted array should be sorted correctly");
  }

  @Test
  @DisplayName("Test radix sort with duplicate elements")
  public void testRadixSortWithDuplicates() {
    int[] arrayWithDuplicates = { 5, 2, 5, 3, 2 };
    int[] expectedArray = { 2, 2, 3, 5, 5 };

    RadixSort.radixSort(arrayWithDuplicates);
    assertArrayEquals(expectedArray, arrayWithDuplicates, "Array with duplicates should be sorted correctly");
  }

  @Test
  @DisplayName("Test radix sort with null array throws exception")
  public void testRadixSortWithNullArray() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      RadixSort.radixSort(null);
    });

    String expectedMessage = "Array cannot be null";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage),
        "Exception message should contain '" + expectedMessage + "'");
  }

  @Test
  @DisplayName("Test radix sort with empty array throws exception")
  public void testRadixSortWithEmptyArray() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      RadixSort.radixSort(new int[] {});
    });

    String expectedMessage = "Array cannot be empty";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage),
        "Exception message should contain '" + expectedMessage + "'");
  }

  // Main method for running the tests manually if needed
  public static void main(String[] args) {
    RadixSortTest test = new RadixSortTest();
    test.setUp();
    test.testRadixSortWithProvidedArray();
    System.out.println("Test completed successfully!");
  }
}