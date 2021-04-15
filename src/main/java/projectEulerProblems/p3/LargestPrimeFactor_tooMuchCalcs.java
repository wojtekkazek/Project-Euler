package projectEulerProblems.p3;

//finds the right answer but doesnt finish the calcs in 10min
//answer is correct only because it is small
public class LargestPrimeFactor_tooMuchCalcs {
    public static void main(String[] args) {
        Long largestPrimeFactorOf600851475143 = findLargestPrimeFactorOf(600851475143L);
        System.out.println(largestPrimeFactorOf600851475143);
    }

    public static Long findLargestPrimeFactorOf(Long number) {
        Long primeFactor = 1L;
        for (long i = 1L; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                if (checkIfPrimary(i)) {
                    primeFactor = i;
                    System.out.println("prime" + primeFactor);
                }
            }
        }
        return primeFactor;
    }

    public static boolean checkIfPrimary(Long number) {
        for (Long i = 2L; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
