package projectEulerProblems.p1;

import projectEulerProblems.p2.EvenFibonacciNumbers;

import java.util.logging.Logger;

public class MultiplesOf3And5_simple {

    public static void main(String[] args) {
        int sumOfAllMultiplesOf3Or5Below1000 = calculateSumOfMultiplesOfTwoNumbersBelowNumber(3, 5, 1000);

        Logger LOGGER = Logger.getLogger(MultiplesOf3And5_simple.class.getName());
        LOGGER.info(String.valueOf(sumOfAllMultiplesOf3Or5Below1000));
    }

    public static int calculateSumOfMultiplesOfTwoNumbersBelowNumber(int multiplier1, int multiplier2, int max) {
        int sum = 0;
        for (int i = 1; i < max; i++) {
            if (i % multiplier1 == 0 || i % multiplier2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
