public class Test8 {
    static boolean isPrime(int a) {
        if (a < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= a / 2; i++) { // Start from 2
            if (a % i == 0) {
                return false; // If divisible, not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

    public static void main(String[] args) {
        boolean result = isPrime(5);
        System.out.println(result); // Output: false
    }
}
