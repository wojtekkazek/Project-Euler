package projectEulerProblems.p1;

import java.util.logging.Logger;

public class MultiplesOf3And5 {

    public static void main(String[] args) {
        int sumOfAllMultiplesOf3Or5Below1000 = calculateSumOfMultiplesOfTwoNumbersBelowNumber(3, 5, 1000);

        Logger LOGGER = Logger.getLogger(MultiplesOf3And5.class.getName());
        LOGGER.info(String.valueOf(sumOfAllMultiplesOf3Or5Below1000));
    }

    public static int calculateSumOfMultiplesOfTwoNumbersBelowNumber(int multiplier1, int multiplier2, int max) {
        int sumOfMultipliesOfNumber1 = calculateSumOfMultiplesOfNumberBelowNumber(multiplier1, max);
        int sumOfMultipliesOfNumber2 = calculateSumOfMultiplesOfNumberBelowNumber(multiplier2, max);
        int leastCommonMultiplier = findLeastCommonMultiplierAbove(multiplier1, multiplier2, 0);
        int sumOfMultipliesOfCommonMultiplier = calculateSumOfMultiplesOfNumberBelowNumber(leastCommonMultiplier, max);
        return sumOfMultipliesOfNumber1 + sumOfMultipliesOfNumber2 - sumOfMultipliesOfCommonMultiplier;
    }

    public static int findLeastCommonMultiplierAbove (int number1, int number2, int min) {
        int n = min + 1;
        while (n % number1 != 0 || n % number2 != 0) {
            n = findLeastCommonMultiplierAbove (number1, number2, n);
        }
        return n;
    }

    public static int calculateSumOfMultiplesOfNumberBelowNumber (int multiplyingNumber, int max) {
        int maxMultiplication = findMaxMultiplicationBelow(multiplyingNumber, max);
        double sum = (((double)multiplyingNumber + (double)maxMultiplication)/2 * maxMultiplication / multiplyingNumber);
        return (int)sum;
    }

    public static int findMaxMultiplicationBelow (int multiplyingNumber, int max) {
        int n = max - 1;
        while (n % multiplyingNumber != 0) {
            n = findMaxMultiplicationBelow(multiplyingNumber, n);
        }
        return n;
    }

}
