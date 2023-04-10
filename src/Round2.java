import java.util.Scanner;

public class Round2 {
    public static void round_2nd(){
        Scanner sc = new Scanner(System.in);
        int attempt = 0, totalattempts = 5, score = 0;
        int randnumber = (int) (Math.random() * 100);

        int temp = totalattempts;

        while (true) {
            score = temp - attempt;
            attempt++;
            totalattempts--;

            if (totalattempts == 0) {
                System.out.println("Time Over.");
                System.out.println("You Lost Second Round....");
                System.out.println("Correct Number is:" + randnumber);
                break;
            }
            System.out.println("Guess a Number:");
            int number = sc.nextInt();
            if (number == randnumber) {
                System.out.println("You win !!");
                System.out.println("Your Attempts is." + attempt);
                System.out.println("Your Score is:" + score);
                break;
            } else if (number < randnumber) {
                System.out.println("Number is Lower.");
            } else if (number > randnumber) {
                System.out.println("Number is higher");
            }
        }
    }
}