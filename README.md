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

## Running Tests

### Using Command Line

1. Compile the source files:

   ```bash
   javac -cp .:lib/* RadixSort.java RadixSortTest.java
   ```

2. Run the tests:
   ```bash
   java -cp .:lib/* org.junit.jupiter.api.Launcher RadixSortTest
   ```

### IDE Setup (IntelliJ IDEA / Eclipse)

1. Ensure JUnit 5 is added to your project's build path
2. Open `RadixSortTest.java`
3. Run the tests using the IDE's built-in test runner

## Dependencies

- JUnit Platform Console Standalone 1.8.2
  - Filename: `junit-platform-console-standalone-1.8.2.jar`
  - Located in the `lib/` directory

### Dependency Details

The project uses a single JAR file for JUnit testing, which includes both the Jupiter API and Engine.

## Algorithm Details

Radix Sort is a non-comparative sorting algorithm that sorts integers by processing individual digits. It works by sorting numbers digit by digit, from the least significant digit to the most significant digit.

## Time Complexity

- Average and Best Case: O(d \* (n + k))
  - d: number of digits
  - n: number of elements
  - k: range of input (10 for decimal)

## Limitations

- Works only with non-negative integers
- Performance may vary with extremely large numbers

## Contributing

Feel free to open issues or submit pull requests to improve the implementation.

## License

This is an educational project created for academic purposes.

### Usage Rights

- Free to use for educational and personal learning
- Not intended for commercial use
- Attribution to the original author (you) is appreciated if used or referenced

### Academic Integrity

If used as a reference or learning resource, please cite the original source and maintain academic honesty.
