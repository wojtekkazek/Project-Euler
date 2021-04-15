package projectEulerProblems.p3;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Long largestPrimeFactorOf600851475143 = findLargestPrimeFactorOf(600851475143L);
        System.out.println(largestPrimeFactorOf600851475143);
    }

    public static Long findLargestPrimeFactorOf(Long number) {
        Long n = number;
        while (generateSmallestPrimaryFactor(n) != n) {
            n = n / generateSmallestPrimaryFactor(n);
        }
        return n;
    }

    public static Long generateSmallestPrimaryFactor(Long number) {
        for (Long i = 2L; i < number; i++) {
            if (number % i == 0) {
                return i;
            }
        }
        return number;
    }
}
