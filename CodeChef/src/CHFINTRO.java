import java.util.Scanner;

class CHFINTRO {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int r = s.nextInt();

        for(int i = 0; i < N; i ++){
            int contestantRating = s.nextInt();
            if(contestantRating<r){
                System.out.println("Bad boi");
            }else{
                System.out.println("Good boi");
            }
        }
    }
}
