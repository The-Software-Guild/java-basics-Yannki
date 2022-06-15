package JavaBasics;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age;

        System.out.println("What is your age?");
        age = in.nextInt();
        System.out.println("Your maximum heart rate should be " + (220 - age) + " beats per minute.");
        System.out.println("Your target HR Zone is " + (int)Math.ceil((220 - age) * 0.5)
                + " - " + (int)Math.ceil((220 - age) * 0.85)  + " beats per minute.");
    }
}

