package projectEulerProblems.p9;

import java.util.Objects;

public class Triplet {

    private int a;
    private int b;
    private int c;

    private int m;
    private int n;

    public Triplet(int m, int n) {
        this.m = m;
        this.n = n;
        a = m * m - n * n;
        b = 2 * m * n;
        c = m * m + n * n;
    }

    public boolean isPythagorean() {
        return a * a + b * b == c *c;
    }

    public int getSum() {
        return a + b + c;
    }

    public int getProduct() {
        return a * b * c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triplet triplet = (Triplet) o;
        return a == triplet.a && b == triplet.b && c == triplet.c && m == triplet.m && n == triplet.n;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, m, n);
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", m=" + m +
                ", n=" + n +
                '}';
    }
}
