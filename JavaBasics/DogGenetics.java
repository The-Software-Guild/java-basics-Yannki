package JavaBasics;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        String dogName;
        int percentsAvailable = 100;
        String[] breeds = {"St. Bernard", "Chihuahua", "Dramatic Rednosed Asian Pub", "Common Cur", "King Doberman"};
        int[] percentages = new int[5];

        System.out.println("What is your dog's name?");
        dogName = in.nextLine();
        System.out.println("Well then, I have this highly reliable report on Sir Fluffy McFlufferkins Esquire's prestigious background right here.\n");

        for (int i = 0; i < percentages.length - 1; i++){
            percentages[i] = rand.nextInt(percentsAvailable) + 1;
            percentsAvailable -= percentages[i]; //Change the range of random int to not go above 100%
        }
        percentages[percentages.length - 1] = percentsAvailable; //Put rest of the percentage into the last breed

        System.out.println(dogName + " is:");
        for (int i = 0; i < breeds.length; i++) {
            System.out.println( percentages[i] + "% " + breeds[i]);
        }

        System.out.println("\nWow, that's QUITE the dog!");
    }
}
