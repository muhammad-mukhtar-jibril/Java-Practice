package myJavaFiles;

import java.util.Scanner;

public class StudentGradeChecker {

    // Scanner object used to receive user input
    static Scanner input = new Scanner(System.in);

    // Tracks the number of students recorded by the program
    static int totalStudentsRecorded = 0;

    // Records and evaluates a student's information
    static void recordStudentInfo(String studentFullName, int score) {

        // Display the student's name and score
        System.out.println("Student Name: " + studentFullName);
        System.out.println("Score: " + score);
        System.out.println(" ");

        // Determine whether the student passed or failed
        if (score >= 50 && score <= 100) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println(" ");

        // Display the available grade categories
        String[] gradeCategory = {
                "1 = Excellent",
                "2 = Good",
                "3 = Average"
        };

        for (int i = 0; i < gradeCategory.length; i++) {
            System.out.println(gradeCategory[i]);
        }
        System.out.println(" ");

        // Allow the user to select a grade category
        System.out.print("Enter Choice: ");
        int choice = input.nextInt();

        // Verify that the selected category matches the student's score
        switch (choice) {

            case 1:
                // Excellent grade for scores 70 and above
                if (score >= 70) {
                    System.out.println("Excellent");
                } else {
                    System.out.println("Grade category and score do not match.");
                }
                break;

            case 2:
                // Good grade for scores between 50 and 69
                if (score >= 50 && score <= 69) {
                    System.out.println("Good");
                } else {
                    System.out.println("Grade category and score do not match.");
                }
                break;

            case 3:
                // Average grade for scores below 50
                if (score < 50) {
                    System.out.println("Average");
                } else {
                    System.out.println("Grade category and score do not match.");
                }
                break;

            default:
                // Handle invalid grade category choices
                System.out.println("Enter a number between 1 and 3");
        }

        System.out.println(" ");

        // Update the total number of students processed
        totalStudentsRecorded = totalStudentsRecorded + 1;

        // Display the running total of recorded students
        System.out.println("Total Students Recorded: " + totalStudentsRecorded);
    }

    public static void main(String[] args) {

        // Process sample student records
        recordStudentInfo("Anas Jibril", 95);
        recordStudentInfo("Hassan Usman", 67);
        recordStudentInfo("Usman Musa", 47);
    }
}
