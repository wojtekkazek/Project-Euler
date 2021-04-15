package projectEulerProblems.p5;

public class SmallestMultiple {
    public static void main(String[] args) {
        int smallestNumberDivisibleByNumbersFrom1To20 = findSmallestNumberDivisibleByNumbersFromRange(1, 20);
        System.out.println(smallestNumberDivisibleByNumbersFrom1To20);
    }

    public static int findSmallestNumberDivisibleByNumbersFromRange (int min, int max) {
        int possibleNumber = max;
        while (!isNumberDivisibleByNumbersFromRange(possibleNumber, min, max)) {
            possibleNumber = possibleNumber + 1;
        }
        return possibleNumber;
    }

    public static boolean isNumberDivisibleByNumbersFromRange (int number, int min, int max) {
        for (int i = min; i <= max; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }
}
