package projectEulerProblems.p2;

import projectEulerProblems.p3.LargestPrimeFactor;

import java.util.logging.Logger;

public class EvenFibonacciNumbers {

    public static void main(String[] args) {
        int sumOfEvenFibonacciNumbersBelow4Million = findSumOfEvenFibonacciNumbersBelow(4000000);

        Logger LOGGER = Logger.getLogger(EvenFibonacciNumbers.class.getName());
        LOGGER.info(String.valueOf(sumOfEvenFibonacciNumbersBelow4Million));
    }

    public static int findSumOfEvenFibonacciNumbersBelow(int max) {
        int i = 1;
        int j = 2;
        int n = i + j;
        int sum = 2;
        while (n < max) {
            if(n % 2 == 0) {
                sum += n;
            }
            i = j;
            j = n;
            n = i + j;
        }
        return sum;
    }

}
