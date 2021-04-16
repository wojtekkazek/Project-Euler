package projectEulerProblems.p9;

import java.util.ArrayList;
import java.util.List;

public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        Triplet tripletWithSumEqualTo1000 = findTripletWithSumEqualTo(1000);
        System.out.println(tripletWithSumEqualTo1000.getProduct());
        System.out.println(tripletWithSumEqualTo1000);
    }

    public static Triplet findTripletWithSumEqualTo (int sum) {
        Triplet tripletWithCorrectSum = new Triplet(0, 0);
        int max = 0;
        while (tripletWithCorrectSum.getSum() != sum) {
            max += 10;
            List<Triplet> triplets = generatePythagoreanTripletsOfMBelow(max);
            tripletWithCorrectSum = doesListHaveTripletWithCorrectSum(triplets, sum);
        }
        return tripletWithCorrectSum;
    }

    public static Triplet doesListHaveTripletWithCorrectSum(List<Triplet> triplets, int sum) {
        for (Triplet triplet: triplets) {
            if (triplet.getSum() == sum) {
                return triplet;
            }
        }
        return new Triplet(0,0);
    }

    // m and n comes from "Generating a triple" method from Wikipedia
    public static List<Triplet> generatePythagoreanTripletsOfMBelow (int max) {
        List<Triplet> pythagoreanTriplets = new ArrayList<>();
        for (int m = 2; m < max; m += 1) {
            for (int n = 1; n < m; n += 1) {
                Triplet triplet = new Triplet(m, n);
                if (triplet.isPythagorean()) {
                    pythagoreanTriplets.add(triplet);
                }
            }
        }
        return pythagoreanTriplets;
    }

}
