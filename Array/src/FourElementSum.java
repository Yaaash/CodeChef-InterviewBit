import java.util.HashSet;

public class FourElementSum {

    public static void main(String[] args) {

        int[] a = new int[]{1, 5, 1, 0, 6, 0};
        int X = 7;

        int size = (a.length * (a.length - 1)) / 2;
        int[] pairA = new int[size];

        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                pairA[k] = a[i] + a[j];
                k++;
            }
        }

        System.out.print(getSum(pairA, X));

    }

    private static int getSum(int[] pairA, int X) {
        HashSet<Integer> hash = new HashSet<>();
        for (int a : pairA) {
            if (hash.contains(X - a)) {
                return 1;
            } else {
                hash.add(a);
            }
        }
        return 0;
    }
}
