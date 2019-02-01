public class MaxAdjacentSum {

    public static void main(String[] args) {

        int[] a = new int[]{-5, -5, -1, -7, 10, -10};

        int prevSum = a[0];
        int sum = a[0];

        for (int j = 1; j < a.length; j++) {
            sum = Math.max(a[j], sum + a[j]);
            prevSum = Math.max(sum, prevSum);
        }
        System.out.println(prevSum);

    }
}
