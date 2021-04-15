package projectEulerProblems.p4;

import java.util.ArrayList;
import java.util.List;

public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int largestPalindromeMadeFromProductOf3Digits = findLargestPalindromeOfDigits(3);
        System.out.println(largestPalindromeMadeFromProductOf3Digits);
    }

    public static int findLargestPalindromeOfDigits(int noOfDigits) {
        int largestPalindrome = 1;
        int max = (int)Math.pow(10, noOfDigits);
        int min = (int)Math.pow(10, noOfDigits - 1);
        for (int i = min; i < max; i++) {
            for (int j = min; j < max; j++) {
                int product = i * j;
                if (checkIfPalindrome(product)) {
                    if (product > largestPalindrome) {
                        largestPalindrome = product;
                    }
                }
            }
        }
        return largestPalindrome;
    }

    public static boolean checkIfPalindrome (int number) {
        List<Integer> digits = generateDigits(number);
        int noOfPairs = digits.size()/2;
        for (int i = 0; i < noOfPairs; i++) {
            if (digits.get(i) != digits.get(digits.size()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> generateDigits (int number) {
        List<Integer> digits = new ArrayList<>();
        int noOfDigits = String.valueOf(number).length();
        for (int i = 1; i < noOfDigits + 1; i++) {
            int digit = Integer.parseInt(String.valueOf(number).substring(i-1, i));
            digits.add(digit);
        }
        return digits;
    }
}
