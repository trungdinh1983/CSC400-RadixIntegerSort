# Radix Sort Implementation

## Overview

This project implements the Radix Sort algorithm for sorting integers in Java, along with comprehensive JUnit tests.

## Features

- Radix Sort implementation for non-negative integers
- Handles various input scenarios
- Detailed test coverage

## Prerequisites

- Java Development Kit (JDK) 8 or later
- JUnit 5 (Jupiter)

## Project Structure

- `RadixSort.java`: Main implementation of the Radix Sort algorithm
- `RadixSortTest.java`: JUnit test cases for the Radix Sort implementation
- `lib/`: Directory containing JUnit dependencies

## Running the Program

### Compiling

```bash
javac RadixSort.java
```

### Running Radix Sort

```bash
java RadixSort
```

## Running Tests

### Using Command Line

1. Compile the source files:

   ```bash
   javac -cp .:lib/junit-platform-console-standalone-1.8.2.jar RadixSort.java RadixSortTest.java
   ```

2. Run the tests:
   ```bash
   java -jar lib/junit-platform-console-standalone-1.8.2.jar --select-class RadixSortTest
   ```

### IDE Setup (IntelliJ IDEA / Eclipse)

1. Ensure JUnit 5 is added to your project's build path
2. Open `RadixSortTest.java`
3. Run the tests using the IDE's built-in test runner

## Dependencies

- JUnit Platform Console Standalone 1.8.2
  - Filename: `junit-platform-console-standalone-1.8.2.jar`
  - Located in the `lib/` directory

## Algorithm Details

Radix Sort is a non-comparative sorting algorithm that sorts integers by processing individual digits. Key characteristics include:

- Sorts numbers digit by digit
- Starts from the least significant digit
- Moves to the most significant digit
- Stable sorting algorithm for integers

## Time Complexity

- Average and Best Case: O(d \* (n + k))
  - d: number of digits
  - n: number of elements
  - k: range of input (10 for decimal)

## Limitations

- Works only with non-negative integers
- Performance may vary with extremely large numbers
- Requires additional memory for sorting

## Example Usage

```java
int[] numbers = {170, 45, 75, 90, 802, 24, 2, 66};
RadixSort.radixSort(numbers);
RadixSort.printArray(numbers);
```

## Contributing

Suggestions and improvements are welcome:

- Fork the repository
- Create a new branch for your feature
- Submit a pull request

## License

This is an educational project created for academic purposes.

### Usage Rights

- Free to use for educational and personal learning
- Not intended for commercial use
- Attribution to the original author is appreciated

### Academic Integrity

If used as a reference or learning resource, please cite the original source and maintain academic honesty.
