public class MaxNonAdjacentSum {

    public static void main(String[] args) {

        int[] a = new int[]{5, 5, -1, 7, 10, -10};

        int prevSum = 0;
        int sum = a[0];

        for (int j = 1; j < a.length; j++) {
            int temp = sum;
            sum = Math.max(sum, a[j] + prevSum);
            prevSum = temp;
        }
        System.out.println(sum);

    }
}
