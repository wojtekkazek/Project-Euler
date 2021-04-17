package projectEulerProblems.p10;

public class SummationOfPrimes_faster {
    public static void main(String[] args) {
        Long sumOfPrimesBelow2Milion = calculateSumOfPrimesBelow(2000000L);
        System.out.println(sumOfPrimesBelow2Milion);
    }

    public static Long calculateSumOfPrimesBelow (Long max) {
        Long sum = 2L;
        int arraySize = (int)(max/2);
        int n = 0;
        Long primes[] = new Long[arraySize];
        primes[n] = 2L;
        for (Long i = 3L; i < max; i += 2) {
            if(checkIfPrimary(i, primes)) {
                n++;
                primes[n] = i;
                sum += i;
            }
        }
        return sum;
    }

    public static boolean checkIfPrimary (Long number, Long[] primesBelow) {
        double squareRoot = Math.pow(number, 0.5);
        int n = 0;
        while (primesBelow[n] <= squareRoot) {
            if (number % primesBelow[n] == 0) {
                return false;
            }
            n++;
        }
        return true;
    }
}
