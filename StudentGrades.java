import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        // Create an ArrayList to store the grades
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student grades. Type -1 to stop.");

        // Input grades from the user
        while (true) {
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();

            // Break if the user enters -1
            if (grade == -1) {
                break;
            }

            // Ensure the grade is valid (e.g., between 0 and 100)
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            } else {
                grades.add(grade);
            }
        }

        // Check if any grades were entered
        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
        } else {
            // Compute the average, highest, and lowest grades
            double total = 0;
            double highest = grades.get(0);
            double lowest = grades.get(0);

            for (double grade : grades) {
                total += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }

            double average = total / grades.size();

            // Display the results
            System.out.println("\nResults:");
            System.out.printf("Average grade: %.2f\n", average);
            System.out.printf("Highest grade: %.2f\n", highest);
            System.out.printf("Lowest grade: %.2f\n", lowest);
        }

        scanner.close();
    }
}
