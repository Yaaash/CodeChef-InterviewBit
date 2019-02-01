import java.util.ArrayList;

public class RearrangeArray {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(4);
        A.add(0);
        A.add(2);
        A.add(1);
        A.add(3);

        int n = A.size();
        for (int i = 0; i < n; i++) {
            int val = A.get(i) + (A.get(A.get(i)) % n) * n;
            System.out.print(val + " ");
            A.set(i, val);
        }
        for (int i = 0; i < n; i++) A.set(i, A.get(i) / n);

        for (int i = 0; i < A.size(); i++) {
            System.out.println(A.get(i));
        }
    }
}
