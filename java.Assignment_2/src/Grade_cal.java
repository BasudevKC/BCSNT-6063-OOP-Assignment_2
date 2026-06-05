import java.util.Scanner;

public class Grade_cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();
        scanner.close();

        String grade = (marks >= 90) ? "A+" :
                (marks >= 85) ? "A" :
                (marks >= 80) ? "A-" :
                (marks >= 75) ? "B+" :
                (marks >= 70) ? "B" :
                (marks >= 65) ? "B-" :
                (marks >= 60) ? "C+" :
                (marks >= 55) ? "C" :
                (marks >= 50) ? "C-" :
                (marks >= 40) ? "D" : "F";

        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}