public class MathUtil {

        // 1. Static method to check if a number is prime
        public static boolean isPrime(int n) {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }

        // 2. Static method to find the greatest common divisor (GCD)
        public static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        // 3. Static method to find the least common multiple (LCM)
        public static int lcm(int a, int b) {
            return (a * b) / gcd(a, b);
        }

        // 4. Static method to find the nth Fibonacci number
        public static int fibonacci(int n) {
            if (n <= 1) return n;
            int a = 0, b = 1, sum = 0;
            for (int i = 2; i <= n; i++) {
                sum = a + b;
                a = b;
                b = sum;
            }
            return b;
        }

        // 5. Static method to calculate factorial
        public static int factorial(int n) {
            if (n == 0) return 1;
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        // 6. Non-static method to check if a number is a perfect number
        public boolean isPerfectNumber(int n) {
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) sum += i;
            }
            return sum == n;
        }

        // 7. Non-static method to calculate the sum of digits
        public int sumOfDigits(int n) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }

        // 8. Non-static method to reverse the digits of a number
        public int reverseNumber(int n) {
            int reversed = 0;
            while (n != 0) {
                reversed = reversed * 10 + n % 10;
                n /= 10;
            }
            return reversed;
        }

        // 9. Non-static method to check if a number is an Armstrong number
        public boolean isArmstrongNumber(int n) {
            int original = n, sum = 0, digits = String.valueOf(n).length();
            while (n != 0) {
                sum += Math.pow(n % 10, digits);
                n /= 10;
            }
            return sum == original;
        }

        // 10. Non-static method to find the next prime number greater than n
        public int nextPrime(int n) {
            int candidate = n + 1;
            while (!isPrime(candidate)) {
                candidate++;
            }
            return candidate;
        }
}
