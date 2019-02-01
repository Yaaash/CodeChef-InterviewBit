import java.util.ArrayList;

public class MathNew {

    private static String cString;

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(0);
        A.add(1);
        A.add(2);
        A.add(5);
        int B = 2;
        int C = 21;

        cString = String.valueOf(C);

        if (B < cString.length()) {
            System.out.println((int) (Math.pow(A.size(), B)));
        } else if (B > cString.length()) {
            System.out.println(0);
        } else {
                int value = permutation(A, B, 0);
                System.out.println(value);

        }
    }

    private static int permutation(ArrayList<Integer> A, int B, int cIndex) {
        if (B <= 0)
            return 0;
        if (cIndex > cString.length())
            return 0;

        int cFirst = Integer.parseInt(String.valueOf(cString.charAt(cIndex)));
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            int element = A.get(i);
            if (element != 0) {
                if (element > cFirst) {
                    return (int) (count * (Math.pow(A.size(), B - 1)));
                } else if (element < cFirst) {
                    count++;
                } else {
                    // permutate for that value
                    cIndex++;
                    int value = permutation(A, B - 1, cIndex);
                    int counterValue = (int) (count * (Math.pow(A.size(), B - 1)));
                    return counterValue + value;
                }
            }
        }
        return 0;
    }
}
