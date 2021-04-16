package projectEulerProblems.p7;

public class Prime10001st {
    public static void main(String[] args) {
        int primary10001st = findPrimaryOfSpecificOrder(10001);
        System.out.println(primary10001st);
    }

    public static int findPrimaryOfSpecificOrder(int orderNo) {
        int i = 1;
        //count = 1 to include primary number 2
        int primaryNumberCount = 1;
        while (primaryNumberCount < orderNo) {
            i += 2;
            if (checkIfPrimary(i)) {
                primaryNumberCount += 1;
            }
        }
        return i;
    }

    public static boolean checkIfPrimary(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
