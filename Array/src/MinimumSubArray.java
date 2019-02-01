public class MinimumSubArray {

    public static void main(String[] args) {

        String input = "abdjfjacufjpb";
        String subString = "bac";

        int[] subArray = new int[256];
        int[] inputArray = new int[256];

        for (Character s : subString.toCharArray()) {
            // match elements
            subArray[s]++;
        }

        int count = 0;
        int start = 0;
        int startIndex = -1;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            inputArray[c]++;
            if (inputArray[c] != 0 && inputArray[c] <= subArray[c]) {
                count++;
            }

            if (count == subString.length()) {

                int startChar = input.charAt(start);

                while ((inputArray[startChar] > subArray[startChar] || subArray[startChar] == 0)) {
                    if (inputArray[startChar] > subArray[startChar])
                        inputArray[startChar]--;

                    start++;
                }

                int length = i - start + 1;
                if (minLength > length) {
                    minLength = length;
                    startIndex = start;
                }
            }
        }

        if (startIndex == -1) {
            System.out.print(-1);
            return;
        }

        String minSubString = input.substring(startIndex, startIndex + minLength);
        System.out.println(minSubString);
    }
}
