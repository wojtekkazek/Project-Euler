package projectEulerProblems.p2;

public class EvenFibonacciNumbers {

    public static void main(String[] args) {
        int sumOfEvenFibonacciNumbersBelow4milion = findSumOfEvenFibonacciNumbersBelow(4000000);
        System.out.println(sumOfEvenFibonacciNumbersBelow4milion);

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
