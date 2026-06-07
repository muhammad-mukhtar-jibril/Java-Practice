package myJavaFiles;

import java.util.Scanner;

public class FamilyInformationSystemV2 {

    // Displays the family name and number of family members
    static void familyInfo(String name, int members) {
        System.out.println("Family Name: " + name);
        System.out.println("Family Members: " + members);
    }

    // Tracks the number of families recorded by the system
    static int totalFamilies = 1;

    public static void main(String[] args) {

        // Create a Scanner object to receive user input
        Scanner input = new Scanner(System.in);

        // Ask the user for the family name and family size
        System.out.print("Enter Family Name: ");
        String familyName = input.next();

        System.out.print("Enter Number of Family Members: ");
        int members = input.nextInt();

        // Display the family information entered by the user
        familyInfo(familyName, members);

        // Determine whether the family is large or small
        if (members >= 5) {
            System.out.println("Large Family");
        } else {
            System.out.println("Small Family");
        }

        // Display available role options
        System.out.println("1 = Father");
        System.out.println("2 = Mother");
        System.out.println("3 = Child");
        System.out.println("4 = Child");

        // Ask the user to select a family role
        System.out.print("Enter Role Number: ");
        int role = input.nextInt();

        // Display the selected role
        switch (role) {
            case 1:
                System.out.println("Father");
                break;
            case 2:
                System.out.println("Mother");
                break;
            case 3:
                System.out.println("Child");
                break;
            case 4:
                System.out.println("Child");
                break;    
            default:
                System.out.println("Member doesn't exist!");
        }

        // Display the total number of families recorded
        System.out.println("Total Families Recorded: " + totalFamilies);

        // Calculate and display the square of the family size
        int membersSquared = (int) Math.pow(members, 2);
        System.out.println("Members Squared: " + membersSquared);

        // Check whether the family size falls within a normal range
        if (members >= 5 && members <= 15) {
            System.out.println("Normal Family Size");
        }

        // Store and display sample family member names
        String[] fam = {"Anas", "Hajara", "Ridwan", "Sumayya"};

        System.out.println("Family Members:");
        for (int i = 0; i < fam.length; i++) {
            System.out.println(fam[i]);
        }

        // Close the Scanner after use
        input.close();
    }
}