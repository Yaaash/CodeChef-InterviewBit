import java.util.Scanner;

public class Lucky {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCase = Integer.parseInt(s.nextLine());

        while(testCase>0) {
            testCase--;

            // take input
            int arraySize = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();

            int[] inputArray = new int[arraySize];
            for (int i =0; i<arraySize; i ++) {
                inputArray[i] = s.nextInt();
            }

            // logic
            if(a>arraySize){
                System.out.println("ALICE");
                break;
            }

            if(b>arraySize){
                System.out.println("BOB");
                break;
            }


            if (a == b) {
                if (arraySize % 2 != 0) {
                    // odd numbers
                    System.out.println("BOB");
                } else {
                    System.out.println("ALICE");
                }
            } else {

                // calculate multiples of b and a
                // compare those multiples.
                int mA =arraySize/a;
                int mB = arraySize/b;

                if (mA > mB) {
                    System.out.println("BOB");
                } else {
                    System.out.println("ALICE");
                }
            }
        }
    }
}
