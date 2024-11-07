# MathUtil - Java Utility Class

This project contains a utility class called `MathUtil` that provides a set of static and non-static methods for performing various advanced mathematical operations. It also includes a `Main` class to test and demonstrate the functionality of these methods.

## Features

The `MathUtil` class includes the following methods:

### Static Methods:
1. **isPrime(int n)**: Checks whether a given number `n` is prime.
2. **gcd(int a, int b)**: Calculates the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
3. **lcm(int a, int b)**: Computes the least common multiple (LCM) of two numbers.
4. **fibonacci(int n)**: Returns the `n`th Fibonacci number (sequence starts from 0).
5. **factorial(int n)**: Calculates the factorial of a number `n` (i.e., `n!`).

### Non-Static Methods:
1. **isPerfectNumber(int n)**: Determines if the given number `n` is a perfect number (a number equal to the sum of its divisors, excluding itself).
2. **sumOfDigits(int n)**: Computes the sum of the digits of the given number `n`.
3. **reverseNumber(int n)**: Reverses the digits of a number `n`.
4. **isArmstrongNumber(int n)**: Checks if a number is an Armstrong number (a number that is equal to the sum of its own digits, each raised to the power of the number of digits).
5. **nextPrime(int n)**: Finds the smallest prime number greater than `n`.

## Installation

To use the `MathUtil` class in your Java project:

1. Clone or download this repository to your local machine.
2. Import the `MathUtil` class into your project.
3. Use the methods of `MathUtil` directly in your main application.

## Usage

### Example Usage:

```java
public class Main {
    public static void main(String[] args) {
        // Static method usage
        System.out.println("isPrime(29): " + MathUtil.isPrime(29));  // true
        System.out.println("gcd(56, 98): " + MathUtil.gcd(56, 98));  // 14

        // Non-static method usage
        MathUtil mathUtil = new MathUtil();
        System.out.println("isPerfectNumber(28): " + mathUtil.isPerfectNumber(28));  // true
    }
}
