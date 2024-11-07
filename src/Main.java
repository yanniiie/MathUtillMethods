public class Main {
        public static void main(String[] args) {
            // Testing static methods

            // Testing isPrime method
            System.out.println("isPrime(29): " + MathUtil.isPrime(29));
            System.out.println("isPrime(30): " + MathUtil.isPrime(30));
            System.out.println("isPrime(2): " + MathUtil.isPrime(2));

            // Testing gcd method
            System.out.println("gcd(56, 98): " + MathUtil.gcd(56, 98));
            System.out.println("gcd(45, 30): " + MathUtil.gcd(45, 30));
            System.out.println("gcd(101, 10): " + MathUtil.gcd(101, 10));

            // Testing lcm method
            System.out.println("lcm(6, 9): " + MathUtil.lcm(6, 9));
            System.out.println("lcm(12, 18): " + MathUtil.lcm(12, 18));
            System.out.println("lcm(7, 5): " + MathUtil.lcm(7, 5));

            // Testing fibonacci method
            System.out.println("fibonacci(10): " + MathUtil.fibonacci(10));
            System.out.println("fibonacci(5): " + MathUtil.fibonacci(5));
            System.out.println("fibonacci(15): " + MathUtil.fibonacci(15));

            // Testing factorial method
            System.out.println("factorial(7): " + MathUtil.factorial(7));
            System.out.println("factorial(5): " + MathUtil.factorial(5));
            System.out.println("factorial(10): " + MathUtil.factorial(10));

            // Testing non-static methods
            MathUtil mathUtil = new MathUtil();

            // Testing isPerfectNumber method
            System.out.println("isPerfectNumber(6): " + mathUtil.isPerfectNumber(6));
            System.out.println("isPerfectNumber(28): " + mathUtil.isPerfectNumber(28));
            System.out.println("isPerfectNumber(12): " + mathUtil.isPerfectNumber(12));

            // Testing sumOfDigits method
            System.out.println("sumOfDigits(98765): " + mathUtil.sumOfDigits(98765));
            System.out.println("sumOfDigits(1234): " + mathUtil.sumOfDigits(1234));
            System.out.println("sumOfDigits(4050): " + mathUtil.sumOfDigits(4050));

            // Testing reverseNumber method
            System.out.println("reverseNumber(56789): " + mathUtil.reverseNumber(56789));
            System.out.println("reverseNumber(12345): " + mathUtil.reverseNumber(12345));
            System.out.println("reverseNumber(9087): " + mathUtil.reverseNumber(9087));

            // Testing isArmstrongNumber method
            System.out.println("isArmstrongNumber(370): " + mathUtil.isArmstrongNumber(370));
            System.out.println("isArmstrongNumber(153): " + mathUtil.isArmstrongNumber(153));
            System.out.println("isArmstrongNumber(123): " + mathUtil.isArmstrongNumber(123));

            // Testing nextPrime method
            System.out.println("nextPrime(50): " + mathUtil.nextPrime(50));
            System.out.println("nextPrime(100): " + mathUtil.nextPrime(100));
            System.out.println("nextPrime(17): " + mathUtil.nextPrime(17));
        }

}