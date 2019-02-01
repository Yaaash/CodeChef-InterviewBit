import java.util.Random;
import java.util.Scanner;

class CHFIDEAL {

    private static final Random gen = new Random();

    /**
     * chooses a random door other than door1 or door2
     */
    private static int chooseAnotherDoor(int door1, int door2) {
        int result;
        do
            result = gen.nextInt(3);
        while (result == door1 || result == door2);
        return result;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int prize = gen.nextInt(3);
        int userChoice1 = gen.nextInt(3);
        System.out.println(userChoice1+1);
        // host opens door other than user's choice without prize
        int hostChoice = chooseAnotherDoor(prize, userChoice1);
        System.out.println(hostChoice+1);
        // user always switches
        int userChoice2 = chooseAnotherDoor(userChoice1, hostChoice);
        if (userChoice2 != prize) {
            System.out.println(userChoice1+1);
        }else{
            System.out.println(userChoice2+1);
        }
    }
}
