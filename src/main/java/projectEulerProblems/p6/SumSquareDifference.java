package projectEulerProblems.p6;

import projectEulerProblems.p7.Prime10001st;

import java.util.logging.Logger;

public class SumSquareDifference {
    public static void main(String[] args) {
        int differenceBetweenSquareOfSumAndSumOfSquaresOfNumbersBelow100 = calculateDifferenceBetweenSquareOfSumAndSumOfSquaresOfNumbersBelow(100);

        Logger LOGGER = Logger.getLogger(SumSquareDifference.class.getName());
        LOGGER.info(String.valueOf(differenceBetweenSquareOfSumAndSumOfSquaresOfNumbersBelow100));
    }

    public static int calculateDifferenceBetweenSquareOfSumAndSumOfSquaresOfNumbersBelow(int max) {
        return calculateSquareOfSumOfNumbersBelow(max) - calculateSumOfSquaresOfNumbersBelow(max);
    }

    public static int calculateSquareOfSumOfNumbersBelow(int max) {
        int sum = 0;
        int n = 1;
        while (n <= max) {
            sum += n;
            n += 1;
        }
        return sum * sum;
    }

    public static int calculateSumOfSquaresOfNumbersBelow(int max) {
        int sum = 0;
        int n = 1;
        while (n <= max) {
            sum += n * n;
            n += 1;
        }
        return sum;
    }
}
