package projectEulerProblems.p10;

import java.util.logging.Logger;

public class SummationOfPrimes {
    public static void main(String[] args) {
        Long sumOfPrimesBelow2Million = calculateSumOfPrimesBelow(2000000L);

        Logger LOGGER = Logger.getLogger(SummationOfPrimes.class.getName());
        LOGGER.info(sumOfPrimesBelow2Million.toString());
    }

    public static Long calculateSumOfPrimesBelow (Long max) {
        Long sum = 2L;
        for (Long i = 3L; i < max; i += 2) {
            if(checkIfPrimary(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean checkIfPrimary (Long number) {
        double squareRoot = Math.pow(number, 0.5);
        for (Long i = 3L; i <= squareRoot; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
