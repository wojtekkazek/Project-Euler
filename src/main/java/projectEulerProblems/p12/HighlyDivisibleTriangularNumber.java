package projectEulerProblems.p12;

import java.util.logging.Logger;

public class HighlyDivisibleTriangularNumber {

    public static void main(String[] args) {
        long triangleNumbersWithMin500Dividers = findTriangleNumberWithMinDividers(500);

        Logger LOGGER = Logger.getLogger(HighlyDivisibleTriangularNumber.class.getName());
        LOGGER.info(String.valueOf(triangleNumbersWithMin500Dividers));
    }

    public static long findTriangleNumberWithMinDividers (int minNoOfDividers) {
        long triangleNumber = 1L;
        long i = 1L;
        while (findHowManyDividersNumberHas(triangleNumber) <= minNoOfDividers) {
            i++;
            triangleNumber += i;
        }
        return triangleNumber;
    }

    public static int findHowManyDividersNumberHas (long number) {
        int noOfDividers = 0;
        long sqrtOfNumber = (long) Math.sqrt((double) number);
        for (int i = 1; i <= sqrtOfNumber; i++) {
            if (number %i == 0) {
                noOfDividers = noOfDividers + 2;
            }
        }
        if (Math.sqrt((double) number) * Math.sqrt((double) number) == number) {
            noOfDividers--;
        }
        return noOfDividers;
    }
}
