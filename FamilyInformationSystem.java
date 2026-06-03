public class FamilyInformationSystem {

  // This method displays all family members and the total number of members.
	static void family(String[] fam){
      // Loop through the array and print each family member.
      for (int i = 0; i < fam.length; i++){
       System.out.println(fam[i]);
      }

      // Print the total number of family members.
      System.out.println("Total family members: " + fam.length);
	}

  // This method displays a family role based on the number provided.
  static void familyRole(int choice){
    switch (choice){
      case 1:
        System.out.println("Father");
        break;

      case 2:
        System.out.println("Mother");
        break;

      case 3:
        System.out.println("First daughter");
        break;

      case 4:
        System.out.println("Daughter");
        break;

      case 5:
        System.out.println("First son");
        break;

      case 6:
        System.out.println("Son");
        break;

      // Execute this block if no matching role is found.
      default:
        System.out.println("Member not found!");
    }
  }

  // This method checks whether the family is large or small.
  static void checkFamilySize(String[] family){

    // If the family has 5 or more members, it is considered large.
    if(family.length >= 5){
      System.out.println("Large family");
    }

    // Otherwise, it is considered small.
    else{
      System.out.println("Small family");
    }
  }

	public static void main(String[] args) {

    // Display the role associated with choice number 3.
    familyRole(1);

    // Store the names of family members in an array.
    String[] fam = {"Father", "Mother", "Daughter1", "Daughter2", "Son1", "Son2"};

    // Check and display whether the family is large or small.
    checkFamilySize(fam);

    // Display all family members and the total number of members.
    family(fam);
	}
}