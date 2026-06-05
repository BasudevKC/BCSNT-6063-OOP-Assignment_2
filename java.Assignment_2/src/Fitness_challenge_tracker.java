import java.util.Scanner;

public class Fitness_challenge_tracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int highest = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter steps for day " + i + ": ");
            int steps = sc.nextInt();
            total = total + steps;
            if (steps > highest) {
                highest = steps;
            }
        }

        int average = total / 7;

        System.out.println("Total Steps: " + total);
        System.out.println("Average Steps: " + average);
        System.out.println("Highest Steps: " + highest);
    }
}