import java.util.Scanner;

public class AI_Age_Predictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("After 10 years you will be: " + (age + 10));
        System.out.println("After 25 years you will be: " + (age + 25));
        System.out.println("After 50 years you will be: " + (age + 50));
        System.out.println("You will turn 100 in year: " + (2026 + (100 - age)));
    }
}