import java.util.Scanner;

public class prime_number_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean prime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (n <= 1)
            prime = false;

        if (prime)
            System.out.println("its a Prime Number");
        else
            System.out.println(" its Not a Prime Number");
    }
}