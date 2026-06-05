import java.util.Scanner;

public class logical_operator_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();


        boolean isSum = (num1 + num2 == num3);

        if (isSum && (num3 == num1 + num2)) {
            System.out.println("True: " + num3 + " is the sum of " + num1 + " and " + num2 + ".");
        } else {
            System.out.println("False: " + num3 + " is NOT the sum of " + num1 + " and " + num2 + ".");
        }

        scanner.close();
    }
}