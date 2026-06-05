import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        scanner.close();

        if (op == '+') System.out.println("Result = " + (a + b));
        else if (op == '-') System.out.println("Result = " + (a - b));
        else if (op == '*') System.out.println("Result = " + (a * b));
        else if (op == '/') {
            if (b == 0) System.out.println("Cannot divide by zero");
            else System.out.println("Result = " + (a / b));
        } else {
            System.out.println("Invalid operator");
        }
    }
}