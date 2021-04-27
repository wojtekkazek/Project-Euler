package projectEulerProblems.p3;

import java.util.logging.Logger;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Long largestPrimeFactorOf600851475143 = findLargestPrimeFactorOf(600851475143L);

        Logger LOGGER = Logger.getLogger(LargestPrimeFactor.class.getName());
        LOGGER.info(String.valueOf(largestPrimeFactorOf600851475143));
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
