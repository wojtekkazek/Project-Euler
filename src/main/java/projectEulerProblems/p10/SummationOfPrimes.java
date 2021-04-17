package projectEulerProblems.p10;

public class SummationOfPrimes {
    public static void main(String[] args) {
        Long sumOfPrimesBelow2Milion = calculateSumOfPrimesBelow(2000000L);
        System.out.println(sumOfPrimesBelow2Milion);
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
        for (Long i = 3L; i <= Math.pow(number, 0.5); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
