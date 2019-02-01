import java.util.Scanner;

public class ChefModulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int x = 0; x < testCases; x++) {

            int N = scanner.nextInt();
            int P = scanner.nextInt();

            int maxValue = 0;
            int count = 0;

            for (int i = 1; i <= P; i++) {
                int p = (N % i);
                if ( p != 0) {
                    for (int j = 1; j <= P; j++) {
                        for (int k = 1; k <= P; k++) {
                            int m = ((p % j) % k) % N;
                            if (m > maxValue) {
                                maxValue = m;
                                count = 1;
                            } else if (m == maxValue) {
                                count++;
                            }
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }
}
