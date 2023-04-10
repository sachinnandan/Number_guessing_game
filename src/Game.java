import java.util.Scanner;
class Game {
    public static void main(String args[]) {
        System.out.println("1. Start");
        System.out.println("2. Exit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1: {
                int attempt = 0, totalattempts = 10, score = 0;
                int randnumber = (int) (Math.random() * 100);

                int temp = totalattempts;

                while (true) {
                    score = temp - attempt;
                    attempt++;
                    totalattempts--;

                    if (totalattempts == 0) {
                        System.out.println("Time Over.");
                        System.out.println("Correct Number is:" + randnumber);
                        break;
                    }
                    System.out.println("Guess a Number:");
                    int number = sc.nextInt();
                    if (number == randnumber) {
                        System.out.println("You Win!! Now Second Round.");
                        System.out.println("Your Attempts is." + attempt);
                        System.out.println("Your Score is:" + score);
                        System.out.println("1. Round 2");
                        System.out.println("2. Exit");
                        int s = sc.nextInt();
                        switch (s) {
                            case 1: {
                                Round2.round_2nd();
                            }
                            case 2: {
                                System.exit(0);
                            }
                        }
                        break;
                    } else if (number < randnumber) {
                        System.out.println("Number is Lower.");
                    } else if (number > randnumber) {
                        System.out.println("Number is higher");
                    }
                }
            }
            case 2: {
                System.exit(0);
            }
        }
    }
}
