package JavaBasics;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int wins = 0;
        int losses = 0;
        int ties = 0;

        int rounds = 0;
        int compDecision;
        int humanDecision;

        do {
            System.out.print("Enter number of rounds you want to play: ");
            try {
                rounds = in.nextInt();
                if (!(rounds <= 10 && rounds >= 1)) {
                    System.out.println("You did not put correct number of rounds.");
                    System.exit(1);
                }
            } catch (Exception e) {
                System.out.println("You did not put a number.");
                System.exit(1);
            }

            for (int i = 0; i < rounds; i++) {
                System.out.println("1) Rock");
                System.out.println("2) Paper");
                System.out.println("3) Scissors");
                System.out.print("Enter number: ");

                //Check if the input is Integer
                while (!in.hasNextInt()) {
                    System.out.println("Choose a number from the given options.");
                }

                humanDecision = in.nextInt();
                compDecision = rand.nextInt(3) + 1;

                //Decision making
                if (humanDecision == 1) {
                    wins += (compDecision == 3) ? 1 : 0;
                    losses += (compDecision == 2) ? 1 : 0;
                    ties += (compDecision == 1) ? 1 : 0;
                } else if (humanDecision == 2) {
                    wins += (compDecision == 1) ? 1 : 0;
                    losses += (compDecision == 3) ? 1 : 0;
                    ties += (compDecision == 2) ? 1 : 0;
                } else if (humanDecision == 3) {
                    wins += (compDecision == 1) ? 1 : 0;
                    losses += (compDecision == 3) ? 1 : 0;
                    ties += (compDecision == 2) ? 1 : 0;
                }

                System.out.println("The computer chose: " + compDecision + ".");
            }

            System.out.println("The game ended with " + wins + " wins, " + losses + "losses and " + ties + " ties.");
            System.out.print("Do you want to play again? YES or NO");
        } while (in.nextLine().equalsIgnoreCase("YES"));

        System.out.println("Thank you for playing!");
    }
}
